package com.package_name.csv_to_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.logging.Logger;

public class JDBCConnector {

    private Logger log = Logger.getLogger(JDBCConnector.class.getName());

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

    public void createDatabase(){
        // todo - create the database query
    }

}