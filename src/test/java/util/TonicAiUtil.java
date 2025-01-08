package util;

import com.google.gson.Gson;
import util.model.JobStatus;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TonicAiUtil {

    //Add your credentials as environment variables
    private static final String TONIC_USER = System.getenv("TONIC_USER");
    private static final String TONIC_PASSWORD = System.getenv("TONIC_PASSWORD");
    private static final String TONIC_BASE_URL = "https://app.tonic.ai/api/";
    private static final String TONIC_AUTH = "Auth/login";
    private static final String TONIC_WORKSPACE_GENERATE = "GenerateData/start?workspaceId=%s&strictMode=NotStrict&diagnosticLogging=false";
    private static final String TONIC_JOB = "Job/%s";
    public static final String TONIC_USER_REQ_BODY = "userName";
    public static final String TONIC_PWD_REQ_BODY = "password";


    public static Boolean runWorkspaceGeneration(String workspaceID) throws URISyntaxException, IOException, InterruptedException {
        var isRunSuccesful = false;
        var cookieManager = new CookieManager();
        var client = HttpClient.newBuilder()
                .cookieHandler(cookieManager)
                .version(HttpClient.Version.HTTP_2)
                .build();

        Gson gson = new Gson();
        Map<String, String> body = new HashMap<>();
        body.put(TONIC_USER_REQ_BODY, TONIC_USER);
        body.put(TONIC_PWD_REQ_BODY, TONIC_PASSWORD);

        //The 1st step is to authenticate in Tonic.AI
        //Tonic AI authentication service will return a TOKEN in the cookies.
        //The code, uses cookieManager to embed the TOKEN in the following request.
        var authRequest = HttpRequest.newBuilder()
                .uri(new URI(TONIC_BASE_URL.concat(TONIC_AUTH)))
                .setHeader("content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(body)))
                .build();
        var authResponse = client.send(authRequest, HttpResponse.BodyHandlers.ofString());
        if (authResponse.statusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + authResponse.statusCode());
        }

        //Running the workspace is an asynchronous process, the 1st step is triggering the process
        //then check the status until completed.
        var genRequest = HttpRequest.newBuilder()
                .uri(new URI(TONIC_BASE_URL.concat(String.format(TONIC_WORKSPACE_GENERATE, workspaceID))))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
        var genResponse = client.send(genRequest, HttpResponse.BodyHandlers.ofString());
        var genResponseMap = gson.fromJson(genResponse.body(), Map.class);
        var jobId = genResponseMap.get("id");
        if (genResponse.statusCode() == 200) {
            var jobStatusRequest = HttpRequest.newBuilder()
                    .uri(new URI(TONIC_BASE_URL.concat(String.format(TONIC_JOB, jobId))))
                    .GET()
                    .build();
            var jobStillRunning = true;
            while (jobStillRunning) {
                var jobStatusResponse = client.send(jobStatusRequest, HttpResponse.BodyHandlers.ofString());
                if (jobStatusResponse.statusCode() == 200) {
                    var jobStatus = gson.fromJson(jobStatusResponse.body(), JobStatus.class);
                    if (!jobStatus.getStatus().equals("Running") && !jobStatus.getStatus().equals("Queued")){
                        jobStillRunning = false;
                        if (jobStatus.getStatus().equals("Completed")){
                            isRunSuccesful = true;
                        }
                    }
                    Thread.sleep(Duration.ofSeconds(30L).toMillis());
                }
            }
        }

        return isRunSuccesful;
    }

}
