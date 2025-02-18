package com.csvdatahandling.advanceproblem.convertjsontocsvandviceversa;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.*;

class Student {
    public int id;
    public String name;
    public int age;
    public String grade;

    public Student() {}

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class JsonCsvConverter {
    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> students = objectMapper.readValue(new File(jsonFile), new TypeReference<List<Student>>() {});

        try (FileWriter writer = new FileWriter(csvFile);
             CSVWriter csvWriter = new CSVWriter(writer)) {

            csvWriter.writeNext(new String[]{"ID", "Name", "Age", "Grade"});

            for (Student student : students) {
                csvWriter.writeNext(new String[]{
                        String.valueOf(student.id),
                        student.name,
                        String.valueOf(student.age),
                        student.grade
                });
            }
        }
        System.out.println("JSON converted to CSV successfully!");
    }

    public static void csvToJson(String csvFile, String jsonFile) throws IOException {
        List<Student> students = new ArrayList<>();

        try (FileReader reader = new FileReader(csvFile);
             CSVReader csvReader = new CSVReader(reader)) {

            String[] headers = csvReader.readNext();
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                students.add(new Student(
                        Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), line[3]
                ));
            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(jsonFile), students);

        System.out.println("CSV converted to JSON successfully!");
    }

    public static void main(String[] args) throws IOException {
        String jsonFile = "src/main/java/com/csvdatahandling/advancedproblems/convertjsontocsvandviceversa/students.json";
        String csvFile = "src/main/java/com/csvdatahandling/advancedproblems/convertjsontocsvandviceversa/students.csv";
        String outputJsonFile = "src/main/java/com/csvdatahandling/advancedproblems/convertjsontocsvandviceversa/output_students.json";

        jsonToCsv(jsonFile, csvFile);
        csvToJson(csvFile, outputJsonFile);
    }
}

