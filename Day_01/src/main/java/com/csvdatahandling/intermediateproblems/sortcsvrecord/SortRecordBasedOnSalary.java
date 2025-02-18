package com.csvdatahandling.intermediateproblems.sortcsvrecord;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SortRecordBasedOnSalary {
    public static void main(String[] args) {

        String filepath ="src/main/java/com/csvdatahandling/indermediateproblems/sortcsvrecord/Employee.csv";
        MyComparator c = new MyComparator();
        Set<String[]> set=new TreeSet<>(c);
        // try block with resource
        try(CSVReader reader =new CSVReader(new FileReader(filepath)))
        {

            String []row ;


            while((row=reader.readNext())!=null){

                // adding each row to set
                set.add(row);
            }
            System.out.println("Employee data sorted based on salary");
        }
        catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        // try block to add to the list
        try(CSVWriter write = new CSVWriter(new FileWriter(filepath))){
            write.writeAll(set);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
