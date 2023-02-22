package com.package_name.csv_to_database;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Types;

import java.util.List;
import java.util.logging.Logger;

public class JDBCConnector {

    private final Logger log = Logger.getLogger(JDBCConnector.class.getName());

    /**
     * Inserts all records from the record list into the charity table
     */
    public void insertRecordList(List<Record> recordList){
        int counter = 1;
        String query = "INSERT INTO charities VALUES (" +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?";

        try (Connection con = DataSourceConfig.dataSource().getConnection();
             PreparedStatement pst = con.prepareStatement(query))
        {
            log.info("inserting records into table...");
            for (Record recordItem : recordList) {
                pst.setString(1, recordItem.getId());
                pst.setObject(2, recordItem.getAbn(), Types.BIGINT);
                pst.setString(3, recordItem.getName());
                pst.setString(4, recordItem.getOtherName());
                pst.setString(5, recordItem.getAddressType());
                pst.setString(6, recordItem.getAddressLine1());
                pst.setString(7, recordItem.getAddressLine2());
                pst.setString(8, recordItem.getAddressLine3());
                pst.setString(9, recordItem.getTownCity());
                pst.setString(10, recordItem.getState());
                pst.setString(11, recordItem.getPostcode());
                pst.setString(12, recordItem.getCountry());
                pst.setString(13, recordItem.getWebsiteUrl());
                pst.setString(14, recordItem.getRegistrationDate());
                pst.setString(15, recordItem.getEstablishedDate());
                pst.setString(16, recordItem.getCharitySize());
                pst.setString(17, String.valueOf(recordItem.getNumberOfResponsiblePersons()));
                pst.setString(18, recordItem.getFinancialYearEnd());
                pst.setBoolean(19, recordItem.isOperates_in_act());
                pst.setBoolean(20, recordItem.isOperates_in_nsw());
                pst.setBoolean(21, recordItem.isOperates_in_nt());
                pst.setBoolean(22, recordItem.isOperates_in_qld());
                pst.setBoolean(23, recordItem.isOperates_in_sa());
                pst.setBoolean(24, recordItem.isOperates_in_tas());
                pst.setBoolean(25, recordItem.isOperates_in_vic());
                pst.setBoolean(26, recordItem.isOperates_in_wa());
                pst.setString(27, recordItem.getOperatingCountries());
                pst.setBoolean(28, recordItem.isPbi());
                pst.setBoolean(29, recordItem.isHpc());
                pst.setBoolean(30, recordItem.isAnimals());
                pst.setBoolean(31, recordItem.isCulture());
                pst.setBoolean(32, recordItem.isEducation());
                pst.setBoolean(33, recordItem.isHealth());
                pst.setBoolean(34, recordItem.isLaw());
                pst.setBoolean(35, recordItem.isNaturalEnvironment());
                pst.setBoolean(36, recordItem.isHuman_rights());
                pst.setBoolean(37, recordItem.isGeneralPublic());
                pst.setBoolean(38, recordItem.isReconciliation());
                pst.setBoolean(39, recordItem.isReligion());
                pst.setBoolean(40, recordItem.isPublicWelfare());
                pst.setBoolean(41, recordItem.isSecurity());
                pst.setBoolean(42, recordItem.isAboriginal_or_torres_strait_islanders());
                pst.setBoolean(43, recordItem.isAdults());
                pst.setBoolean(44, recordItem.isElderly());
                pst.setBoolean(45, recordItem.isChildren());
                pst.setBoolean(46, recordItem.isOverseas());
                pst.setBoolean(47, recordItem.isEarlyChildhood());
                pst.setBoolean(48, recordItem.isEthnicGroups());
                pst.setBoolean(49, recordItem.isFamilies());
                pst.setBoolean(50, recordItem.isFemales());
                pst.setBoolean(51, recordItem.isFinancial());
                pst.setBoolean(52, recordItem.isLgbtPlus());
                pst.setBoolean(53, recordItem.isGeneralCommunity());
                pst.setBoolean(54, recordItem.isMales());
                pst.setBoolean(55, recordItem.isMigrants());
                pst.setBoolean(56, recordItem.isOtherBeneficiaries());
                pst.setBoolean(57, recordItem.isOtherCharities());
                pst.setBoolean(58, recordItem.isHomelessness());
                pst.setBoolean(59, recordItem.isChronic_illness());
                pst.setBoolean(60, recordItem.isDisabilities());
                pst.setBoolean(61, recordItem.isPrePostReleaseOffenders());
                pst.setBoolean(62, recordItem.isRural());
                pst.setBoolean(63, recordItem.isUnemployed());
                pst.setBoolean(64, recordItem.isVeterans());
                pst.setBoolean(65, recordItem.isVictims_of_crime());
                pst.setBoolean(66, recordItem.isVictims_of_disaster());
                pst.setBoolean(67, recordItem.isYouth());

                pst.executeUpdate();
                log.info("inserted row: " + counter++);
            }
            log.info("Successfully inserted all records");
        } catch (SQLException e) {
            log.severe("fatal error: failed to insert rows into the database");
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates the table for the charity information
     */
    public void createDatabase(){
        try (Connection con = DataSourceConfig.dataSource().getConnection();
             Statement st = con.createStatement();){
            st.executeQuery("CREATE TABLE charities (" +
                    "ID TEXT PRIMARY KEY," +
                    "ABN BIGINT," +
                    "Other_Organisation_Names TEXT," +
                    "Address_Type TEXT," +
                    "Address_Line_1 TEXT," +
                    "Address_Line_2 TEXT," +
                    "Address_Line_3 TEXT," +
                    "Town_City TEXT," +
                    "State TEXT," +
                    "Postcode TEXT," +
                    "Country TEXT," +
                    "Charity_Website TEXT," +
                    "Registration_Date TEXT," +
                    "Date_Organisation_Established TEXT," +
                    "Charity_Size TEXT," +
                    "Number_of_Responsible_Persons TEXT," +
                    "Financial_Year_End TEXT," +
                    "Operates_in_ACT BOOLEAN," +
                    "Operates_in_NSW BOOLEAN," +
                    "Operates_in_NT BOOLEAN," +
                    "Operates_in_QLD BOOLEAN," +
                    "Operates_in_SA BOOLEAN," +
                    "Operates_in_TAS BOOLEAN," +
                    "Operates_in_VIC BOOLEAN," +
                    "Operates_in_WA BOOLEAN," +
                    "Operating_Countries TEXT," +
                    "PBI BOOLEAN," +
                    "HPC BOOLEAN," +
                    "Preventing_or_relieving_suffering_of_animals BOOLEAN," +
                    "Advancing_Culture BOOLEAN," +
                    "Advancing_Education BOOLEAN," +
                    "Advancing_Health BOOLEAN," +
                    "Promote_or_oppose_a_change_to_law__government_poll_or_prac BOOLEAN," +
                    "Advancing_natual_environment BOOLEAN," +
                    "Promoting_or_protecting_human_rights BOOLEAN," +
                    "Purposes_beneficial_to_ther_general_public_and_other_analogous BOOLEAN," +
                    "Promoting_reconciliation__mutual_respect_and_tolerance BOOLEAN," +
                    "Advancing_Religion BOOLEAN," +
                    "Advancing_social_or_public_welfare BOOLEAN," +
                    "Advancing_security_or_safety_of_Australia_or_Australian_public BOOLEAN," +
                    "Aboriginal_or_TSI BOOLEAN," +
                    "Adults BOOLEAN," +
                    "Aged_Persons BOOLEAN," +
                    "Children BOOLEAN," +
                    "Communities_Overseas BOOLEAN," +
                    "Early_Childhood BOOLEAN," +
                    "Ethnic_Groups BOOLEAN," +
                    "Families BOOLEAN," +
                    "Females BOOLEAN," +
                    "Financially_Disadvantaged BOOLEAN," +
                    "Gay_Lesbian_Bisexual BOOLEAN," +
                    "General_Community_in_Australia BOOLEAN," +
                    "Males BOOLEAN," +
                    "Migrants_Refugees_or_Asylum_Seekers BOOLEAN," +
                    "Other_Beneficiaries BOOLEAN," +
                    "Other_Charities BOOLEAN," +
                    "People_at_risk_of_homelessness BOOLEAN," +
                    "People_with_Chronic_Illness BOOLEAN," +
                    "People_with_Disabilities BOOLEAN," +
                    "Pre_Post_Release_Offenders BOOLEAN," +
                    "Rural_Regional_Remote_Communities BOOLEAN," +
                    "Unemployed_Person BOOLEAN," +
                    "Veterans_or_their_families BOOLEAN," +
                    "Victims_of_crime BOOLEAN," +
                    "Victims_of_Disasters BOOLEAN," +
                    "Youth BOOLEAN" +
                    ");");
            log.info("successfully created table");
        } catch (SQLException e){
            log.severe("fatal error - failed to create table");
            e.printStackTrace();
        }
    }

}