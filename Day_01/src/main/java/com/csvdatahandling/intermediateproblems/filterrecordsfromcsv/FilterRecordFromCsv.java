package com.csvdatahandling.intermediateproblems.filterrecordsfromcsv;

public class FilterRecordFromCsv {
    public static void main(String[] args) {
        // file path
        String filepath ="src/main/java/com/csvdatahandling/indermediateproblems/filterrecordsfromcsv/CSVData.csv";
        // calling the method to filter record and print
        FilterRecord.filterRecord(filepath);
    }

}
