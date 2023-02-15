package com.package_name.csv_to_database;

import java.io.IOException;
import java.util.List;

public class Main {

    private static List<Record> recordList;

    public static void main(String[] args) {
        // populate the record list with Record objects
        readCSV();

        JDBCConnector jdbcConnector = new JDBCConnector();

        // create the database
        jdbcConnector.createDatabase();

        // populate the database
        jdbcConnector.insertRecordList(recordList);
    }

    private static void readCSV(){
        try {
            CSVReader csvReader = new CSVReader("datadotgov_main.csv");
            csvReader.parseFile();
            recordList = csvReader.getRecordList();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
