package util;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class EmployeesUtil {

    private static final String URL = "jdbc:mysql://synthdatapoc-mysql.cbsvhjvylbyb.us-east-1.rds.amazonaws.com:3306/synthdatapoc";
    private static final String USER = "admin";
    private static final String PASSWORD = "yMdNHGJ4AQlgHYU5D6E2";

    public static Integer getSalesEmployee() {

        Integer id = null;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT emp_no FROM employees WHERE title_code = 's0010-SA' LIMIT 1")) {

            while (resultSet.next()) {
                id = resultSet.getInt("emp_no");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
