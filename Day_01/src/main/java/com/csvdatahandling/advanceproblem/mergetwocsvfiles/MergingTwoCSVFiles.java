package com.csvdatahandling.advanceproblem.mergetwocsvfiles;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergingTwoCSVFiles {
    public static void mergingTwoCSVFiles(String filePath1, String filePath2, String outputFile){
        Map<String, String[]> studentData = new HashMap<>();

        //Try block
        try (CSVReader reader1 = new CSVReader(new FileReader(filePath1))) {
            String[] nextLine;
            // Skipping header
            reader1.readNext();

            while ((nextLine = reader1.readNext()) != null) {
                studentData.put(nextLine[0], new String[]{nextLine[1], nextLine[2]});
            }
        }
        // Catch block
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        //Try block
        try (CSVReader reader2 = new CSVReader(new FileReader(filePath2));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            String[] nextLine;
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"}); // Write header
            // Skipping header
            reader2.readNext();

            while ((nextLine = reader2.readNext()) != null) {
                String id = nextLine[0];
                if (studentData.containsKey(id)) {
                    String[] studentInfo = studentData.get(id);
                    String[] mergedData = {id, studentInfo[0], studentInfo[1], nextLine[1], nextLine[2]};
                    writer.writeNext(mergedData);
                }
            }
            System.out.println("CSV files merged successfully!");
        }
        // Catch block
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
