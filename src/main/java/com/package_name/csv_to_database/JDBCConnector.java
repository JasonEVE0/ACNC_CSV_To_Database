package com.package_name.csv_to_database;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class JDBCConnector {

    private String url = "jdbc:mysql://localhost:3306/evesyn";
    private String username = "root";
    private String password = "Swag123!";
    private Logger log = Logger.getLogger(JDBCConnector.class.getName());

    public void insertRecordList(List<Record> recordList){
        dont run again
        String query = "INSERT INTO charities VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = con.prepareStatement(query))
        {
            log.info("inserting records into table...");
            for (Record recordItem : recordList) {
                pst.setString(1, recordItem.getId());
                pst.setObject(2, recordItem.getAbn(), Types.BIGINT);
                pst.setString(3, recordItem.getName());
                pst.setString(4, recordItem.getWebsiteUrl());
                pst.setBoolean(5, recordItem.isOperates_in_act());
                pst.setBoolean(6, recordItem.isOperates_in_nsw());
                pst.setBoolean(7, recordItem.isOperates_in_nt());
                pst.setBoolean(8, recordItem.isOperates_in_qld());
                pst.setBoolean(9, recordItem.isOperates_in_sa());
                pst.setBoolean(10, recordItem.isOperates_in_tas());
                pst.setBoolean(11, recordItem.isOperates_in_vic());
                pst.setBoolean(12, recordItem.isOperates_in_wa());
                pst.setBoolean(13, recordItem.isAnimals());
                pst.setBoolean(14, recordItem.isCulture());
                pst.setBoolean(15, recordItem.isEducation());
                pst.setBoolean(16, recordItem.isHealth());
                pst.setBoolean(17, recordItem.isLaw());
                pst.setBoolean(18, recordItem.isHuman_rights());
                pst.setBoolean(19, recordItem.isPublic_welfare());
                pst.setBoolean(20, recordItem.isReligion());
                pst.setBoolean(21, recordItem.isSecurity());
                pst.setBoolean(22, recordItem.isAboriginal_or_torres_strait_islanders());
                pst.setBoolean(23, recordItem.isAdults());
                pst.setBoolean(24, recordItem.isElderly());
                pst.setBoolean(25, recordItem.isChildren());
                pst.setBoolean(26, recordItem.isOverseas());
                pst.setBoolean(27, recordItem.isDiversity());
                pst.setBoolean(28, recordItem.isFemales());
                pst.setBoolean(29, recordItem.isFamilies());
                pst.setBoolean(30, recordItem.isFinancial());
                pst.setBoolean(31, recordItem.isLgbt_plus());
                pst.setBoolean(32, recordItem.isMigrants());
                pst.setBoolean(33, recordItem.isMales());
                pst.setBoolean(34, recordItem.isChronic_illness());
                pst.setBoolean(35, recordItem.isDisabilities());
                pst.setBoolean(36, recordItem.isRural());
                pst.setBoolean(37, recordItem.isUnemployed());
                pst.setBoolean(38, recordItem.isVeterans());
                pst.setBoolean(39, recordItem.isYouth());
                pst.setBoolean(40, recordItem.isVictims_of_crime());
                pst.setBoolean(41, recordItem.isVictims_of_disaster());
                pst.executeUpdate();
                log.info("inserted row");
            }
            log.info("Successfully inserted all records!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

//
//    public void insertRecordList(List<Record> recordList){
//        try (Connection con = DriverManager.getConnection(url, username, password);
//             Statement st = con.createStatement())
//        {
//            log.info("inserting records into table...");
//            for (Record recordItem : recordList) {
//                st.executeUpdate("INSERT INTO charities VALUES (" +
//                        recordItem.getId() + ", " +
//                        recordItem.getAbn() + ", " +
//                        recordItem.getName() + ", " +
//                        recordItem.getWebsiteUrl() + ", " +
//                        recordItem.isOperates_in_act() + ", " +
//                        recordItem.isOperates_in_nsw() + ", " +
//                        recordItem.isOperates_in_nt() + ", " +
//                        recordItem.isOperates_in_qld() + ", " +
//                        recordItem.isOperates_in_sa() + ", " +
//                        recordItem.isOperates_in_tas() + ", " +
//                        recordItem.isOperates_in_vic() + ", " +
//                        recordItem.isOperates_in_wa() + ", " +
//                        recordItem.isAnimals() + ", " +
//                        recordItem.isCulture() + ", " +
//                        recordItem.isEducation() + ", " +
//                        recordItem.isHealth() + ", " +
//                        recordItem.isLaw() + ", " +
//                        recordItem.isHuman_rights() + ", " +
//                        recordItem.isPublic_welfare() + ", " +
//                        recordItem.isReligion() + ", " +
//                        recordItem.isSecurity() + ", " +
//                        recordItem.isAboriginal_or_torres_strait_islanders() + ", " +
//                        recordItem.isAdults() + ", " +
//                        recordItem.isElderly() + ", " +
//                        recordItem.isChildren() + ", " +
//                        recordItem.isOverseas() + ", " +
//                        recordItem.isDiversity() + ", " +
//                        recordItem.isFemales() + ", " +
//                        recordItem.isFamilies() + ", " +
//                        recordItem.isFinancial() + ", " +
//                        recordItem.isLgbt_plus() + ", " +
//                        recordItem.isMigrants() + ", " +
//                        recordItem.isMales() + ", " +
//                        recordItem.isChronic_illness() + ", " +
//                        recordItem.isDisabilities() + ", " +
//                        recordItem.isRural() + ", " +
//                        recordItem.isUnemployed() + ", " +
//                        recordItem.isVeterans() + ", " +
//                        recordItem.isYouth() + ", " +
//                        recordItem.isVictims_of_crime() + ", " +
//                        recordItem.isVictims_of_disaster() + ", " +
//                        ")"
//                );
//            }
//            log.info("Successfully inserted all records!");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
