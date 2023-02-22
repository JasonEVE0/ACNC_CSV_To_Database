package com.package_name.csv_to_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceConfig {

    private static String url = "";
    private static String username = "";
    private static String password = "";

    public static Connection dataSource() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

}