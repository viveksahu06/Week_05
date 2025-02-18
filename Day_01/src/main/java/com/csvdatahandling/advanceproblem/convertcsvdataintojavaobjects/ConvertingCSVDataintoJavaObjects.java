package com.csvdatahandling.advanceproblem.convertcsvdataintojavaobjects;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertingCSVDataintoJavaObjects {
    public static List<Student> convertCSVDataintoJavaObjects(String filePath){
        List<Student> students = new ArrayList<>();
        // Try Block
        try(CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine= reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                //Details
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                int age = Integer.parseInt(nextLine[2]);
                double marks = Double.parseDouble(nextLine[3]);
                //Adding details
                students.add(new Student(id,name,age,marks));
            }
        }
        // Catch Block
        catch(IOException | CsvValidationException e){
            e.printStackTrace();
        }
        // return statement
        return students;
    }
}
