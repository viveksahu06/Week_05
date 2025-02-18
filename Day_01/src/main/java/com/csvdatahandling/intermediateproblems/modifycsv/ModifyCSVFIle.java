///*Read a CSV file and increase the salary of employees from the "IT" department by 10%.
//Save the updated records back to a new CSV file.
//*/
package com.csvdatahandling.intermediateproblems.modifycsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModifyCSVFIle {
    public static void main(String[] args) {
        // file path
        String filepath ="src/main/java/com/csvdatahandling/indermediateproblems/modifycsv/Employee.csv";
        // taking list to store all data of file
        List<String[]> list=new ArrayList<>();
        // try block with resource
        try(CSVReader reader =new CSVReader(new FileReader(filepath)))
            {

            String []row ;
            String depar ="IT";

            while((row=reader.readNext())!=null){
                if(row[2].equalsIgnoreCase(depar)){
                    String newSalary = String.valueOf(Double.parseDouble(row[3])+(Double.parseDouble(row[3])*10/100.0));
                    row[3]=newSalary;
                }
                // adding each row to list
                list.add(row);
            }
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
            write.writeAll(list);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

