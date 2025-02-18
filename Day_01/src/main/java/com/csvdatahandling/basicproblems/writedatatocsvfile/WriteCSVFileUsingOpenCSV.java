package com.csvdatahandling.basicproblems.writedatatocsvfile;

import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFileUsingOpenCSV {
    public static void writingUsingOpenCsv(String filepath){
        try(CSVWriter write = new CSVWriter(new FileWriter(filepath,true))){
            // writing data to csv file using OpenCsv External library
            String[] header = {"ID", "Name", "Department", "Salary"};
            String[] emp1 = {"107", "viraj", "Development", "62000"};
            write.writeNext(header);
            write.writeNext(emp1);
            System.out.println("File updated using OpenCSV ");
            // caching the exception
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
