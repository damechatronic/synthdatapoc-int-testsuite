package util;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class CredentialsUtil {

    private static final String URL = "jdbc:mysql://synthdatapoc-mysql.cbsvhjvylbyb.us-east-1.rds.amazonaws.com:3306/synthdatapoc";
    private static final String USER = "admin";
    private static final String PASSWORD = "yMdNHGJ4AQlgHYU5D6E2";

    public static Map<String, String> getValidCredentials() {

        Map<String, String> credentials = new HashMap<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT user, password FROM credentials LIMIT 1")) {

            while (resultSet.next()) {
                String user = resultSet.getString("user");
                String password = resultSet.getString("password");
                credentials.put("username", user);
                credentials.put("password", password);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return credentials;
    }

}
