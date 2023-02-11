package com.package_name.csv_to_database;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private final Reader reader;
    private final List<Record> recordList;

    public CSVReader(String path) throws FileNotFoundException {
        reader = new FileReader(path);
        recordList = new ArrayList<>();
    }

    public void parseFile() throws IOException {
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader(Headers.HEADER)
                .parse(reader);

        for (CSVRecord record : records){
            // skip the first row, since it only contains headers
            if (record.get("ABN").equals("ABN")) continue;

            Record recordItem = new Record(
                    record.get("ABN"),
                    record.get("Charity_Legal_Name"),
                    record.get("Charity_Website"),
                    record.get("Operates_in_ACT"),
                    record.get("Operates_in_NSW"),
                    record.get("Operates_in_NT"),
                    record.get("Operates_in_QLD"),
                    record.get("Operates_in_SA"),
                    record.get("Operates_in_TAS"),
                    record.get("Operates_in_VIC"),
                    record.get("Operates_in_WA"),
                    record.get("Preventing_or_relieving_suffering_of_animals"),
                    record.get("Advancing_Culture"),
                    record.get("Advancing_Education"),
                    record.get("Advancing_Health"),
                    record.get("Promote_or_oppose_a_change_to_law__government_poll_or_prac"),
                    record.get("Promoting_or_protecting_human_rights"),
                    record.get("Purposes_beneficial_to_ther_general_public_and_other_analogous"),
                    record.get("Advancing_Religion"),
                    record.get("Advancing_security_or_safety_of_Australia_or_Australian_public"),
                    record.get("Aboriginal_or_TSI"),
                    record.get("Adults"),
                    record.get("Aged_Persons"),
                    record.get("Children"),
                    record.get("Communities_Overseas"),
                    record.get("Ethnic_Groups"),
                    record.get("Females"),
                    record.get("Families"),
                    record.get("Financially_Disadvantaged"),
                    record.get("Gay_Lesbian_Bisexual"),
                    record.get("Migrants_Refugees_or_Asylum_Seekers"),
                    record.get("Males"),
                    record.get("People_with_Chronic_Illness"),
                    record.get("People_with_Disabilities"),
                    record.get("Rural_Regional_Remote_Communities"),
                    record.get("Unemployed_Person"),
                    record.get("Veterans_or_their_families"),
                    record.get("Youth"),
                    record.get("Victims_of_crime"),
                    record.get("Victims_of_Disasters")
                    );

            recordList.add(recordItem);
        }
    }

    public List<Record> getRecordList(){
        return recordList;
    }

}
