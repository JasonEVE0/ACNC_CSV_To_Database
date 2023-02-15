package com.package_name.csv_to_database;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceConfig {

    private static String url = "";
    private static String username = "";
    private static String password = "";

    public static DataSource dataSource() throws SQLException {
        return (DataSource) DriverManager.getConnection(url, username, password);
    }

}