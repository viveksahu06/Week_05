package com.csvdatahandling.advanceproblem.detectduplicatesinacsvfile;

import static com.csvdatahandling.advanceproblem.detectduplicatesinacsvfile.DetectingDuplicatesInACSVFile.detectDuplicates;

public class DetectDuplicatesInACSVFile {
    public static void main(String[] args) {
        //FilePath
        String filePath = "src/main/java/com/csvdatahandling/advancedproblems/detectduplicatesinacsvfile/file.csv";
        //Calling method
        detectDuplicates(filePath);
    }
}
