package com.csvdatahandling.intermediateproblems.searchrecordfromcsv;

public class SearchRecord {
    public static void main(String[] args) {
        // file path
        String filePath ="src/main/java/com/csvdatahandling/indermediateproblems/searchrecordfromcsv/Employee.csv";
        // calling method to search the record based on the employee name
        SearchRecordAndPrint.searchAndPrint(filePath);
    }
}
