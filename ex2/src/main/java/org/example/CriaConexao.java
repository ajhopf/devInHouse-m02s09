package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {
    private final static String connectionString = "jdbc:oracle:thin:@localhost:1521/devinhouse";
    private final static String user = "admin";
    private final static String password = "admin";
    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(connectionString, user, password);
    }
}
