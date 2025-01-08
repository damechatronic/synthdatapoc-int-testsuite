package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GenRocketUtil {


    String genRocketFolder = System.getenv("GEN_ROCKET_HOME");

    public void runGenRocketScenario(String scenarioName) {

        List<String> commands = new ArrayList<>();
        commands.add("cmd.exe");
        commands.add("/c");
        commands.add(String.format("genrocket -r %s.grs", scenarioName));
        runSystemCommands(commands);
    }

    public void runGenRocketScenario(String scenarioName, String config) {

        List<String> commands = new ArrayList<>();
        commands.add("cmd.exe");
        commands.add("/c");
        commands.add(String.format("genrocket -r %s.grs -or %s", scenarioName, config));
        runSystemCommands(commands);
    }


    private void runSystemCommands(List<String> commands){
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            processBuilder.directory(new File(genRocketFolder + "\\test_cases"));
            Process process = processBuilder.start();

            BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String line;
            while ((line = outputReader.readLine()) != null) {
                System.out.println(line);
            }
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line);
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("\nExited with code: " + exitCode);

//            int exitCode = process.waitFor();
//            if (exitCode == 0) {
//                System.out.println("Command executed successfully.");
//            } else {
//                System.out.println("Command failed with exit code: " + exitCode);
//            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
