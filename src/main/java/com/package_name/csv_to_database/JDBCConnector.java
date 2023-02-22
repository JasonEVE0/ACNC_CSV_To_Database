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
        String query = "INSERT INTO charities(ABN, Charity_Legal_Name, Other_Organisation_Names, Address_Type, Address_Line_1, Address_Line_2, Address_Line_3, Town_City, State, Postcode, Country, Charity_Website, Registration_Date, Date_Organisation_Established, Charity_Size, Number_of_Responsible_Persons, Financial_Year_End, Operates_in_ACT, Operates_in_NSW, Operates_in_NT, Operates_in_QLD, Operates_in_SA, Operates_in_TAS, Operates_in_VIC, Operates_in_WA, Operating_Countries, PBI, HPC, Preventing_or_relieving_suffering_of_animals, Advancing_Culture, Advancing_Education, Advancing_Health," +
                "Promote_or_oppose_a_change_to_law__government_poll_or_prac, Advancing_natual_environment, Promoting_or_protecting_human_rights, Purposes_beneficial_to_ther_general_public_and_other_analogous, Promoting_reconciliation__mutual_respect_and_tolerance, Advancing_Religion, Advancing_social_or_public_welfare, Advancing_security_or_safety_of_Australia_or_Australian_public, Aboriginal_or_TSI, Adults, Aged_Persons, Children, Communities_Overseas, Early_Childhood, Ethnic_Groups, Families, Females, Financially_Disadvantaged, Gay_Lesbian_Bisexual, General_Community_in_Australia," +
                "Males, Migrants_Refugees_or_Asylum_Seekers, Other_Beneficiaries, Other_Charities, People_at_risk_of_homelessness, People_with_Chronic_Illness, People_with_Disabilities, Pre_Post_Release_Offenders, Rural_Regional_Remote_Communities, Unemployed_Person, Veterans_or_their_families, Victims_of_crime, Victims_of_Disasters, Youth) VALUES (" +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                "?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DataSourceConfig.dataSource();
             PreparedStatement pst = con.prepareStatement(query))
        {
            log.info("inserting records into table...");
            for (Record recordItem : recordList) {
                pst.setObject(1, recordItem.getAbn(), Types.BIGINT);
                pst.setString(2, recordItem.getName());
                pst.setString(3, recordItem.getOtherName());
                pst.setString(4, recordItem.getAddressType());
                pst.setString(5, recordItem.getAddressLine1());
                pst.setString(6, recordItem.getAddressLine2());
                pst.setString(7, recordItem.getAddressLine3());
                pst.setString(8, recordItem.getTownCity());
                pst.setString(9, recordItem.getState());
                pst.setString(10, recordItem.getPostcode());
                pst.setString(11, recordItem.getCountry());
                pst.setString(12, recordItem.getWebsiteUrl());
                pst.setString(13, recordItem.getRegistrationDate());
                pst.setString(14, recordItem.getEstablishedDate());
                pst.setString(15, recordItem.getCharitySize());
                pst.setString(16, String.valueOf(recordItem.getNumberOfResponsiblePersons()));
                pst.setString(17, recordItem.getFinancialYearEnd());
                pst.setBoolean(18, recordItem.isOperates_in_act());
                pst.setBoolean(19, recordItem.isOperates_in_nsw());
                pst.setBoolean(20, recordItem.isOperates_in_nt());
                pst.setBoolean(21, recordItem.isOperates_in_qld());
                pst.setBoolean(22, recordItem.isOperates_in_sa());
                pst.setBoolean(23, recordItem.isOperates_in_tas());
                pst.setBoolean(24, recordItem.isOperates_in_vic());
                pst.setBoolean(25, recordItem.isOperates_in_wa());
                pst.setString(26, recordItem.getOperatingCountries());
                pst.setBoolean(27, recordItem.isPbi());
                pst.setBoolean(28, recordItem.isHpc());
                pst.setBoolean(29, recordItem.isAnimals());
                pst.setBoolean(30, recordItem.isCulture());
                pst.setBoolean(31, recordItem.isEducation());
                pst.setBoolean(32, recordItem.isHealth());
                pst.setBoolean(33, recordItem.isLaw());
                pst.setBoolean(34, recordItem.isNaturalEnvironment());
                pst.setBoolean(35, recordItem.isHuman_rights());
                pst.setBoolean(36, recordItem.isGeneralPublic());
                pst.setBoolean(37, recordItem.isReconciliation());
                pst.setBoolean(38, recordItem.isReligion());
                pst.setBoolean(39, recordItem.isPublicWelfare());
                pst.setBoolean(40, recordItem.isSecurity());
                pst.setBoolean(41, recordItem.isAboriginal_or_torres_strait_islanders());
                pst.setBoolean(42, recordItem.isAdults());
                pst.setBoolean(43, recordItem.isElderly());
                pst.setBoolean(44, recordItem.isChildren());
                pst.setBoolean(45, recordItem.isOverseas());
                pst.setBoolean(46, recordItem.isEarlyChildhood());
                pst.setBoolean(47, recordItem.isEthnicGroups());
                pst.setBoolean(48, recordItem.isFamilies());
                pst.setBoolean(49, recordItem.isFemales());
                pst.setBoolean(50, recordItem.isFinancial());
                pst.setBoolean(51, recordItem.isLgbtPlus());
                pst.setBoolean(52, recordItem.isGeneralCommunity());
                pst.setBoolean(53, recordItem.isMales());
                pst.setBoolean(54, recordItem.isMigrants());
                pst.setBoolean(55, recordItem.isOtherBeneficiaries());
                pst.setBoolean(56, recordItem.isOtherCharities());
                pst.setBoolean(57, recordItem.isHomelessness());
                pst.setBoolean(58, recordItem.isChronic_illness());
                pst.setBoolean(59, recordItem.isDisabilities());
                pst.setBoolean(60, recordItem.isPrePostReleaseOffenders());
                pst.setBoolean(61, recordItem.isRural());
                pst.setBoolean(62, recordItem.isUnemployed());
                pst.setBoolean(63, recordItem.isVeterans());
                pst.setBoolean(64, recordItem.isVictims_of_crime());
                pst.setBoolean(65, recordItem.isVictims_of_disaster());
                pst.setBoolean(66, recordItem.isYouth());

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
        try (Connection con = (Connection) DataSourceConfig.dataSource();
             Statement st = con.createStatement();){
            st.executeUpdate("CREATE TABLE charities (" +
                    "ID INT AUTO_INCREMENT PRIMARY KEY," +
                    "ABN BIGINT," +
                    "Charity_Legal_Name TEXT," +
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