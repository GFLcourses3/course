package singleton.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static final String URL = "URL";
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";

    private static Connection connection;

    static {
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
