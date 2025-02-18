/*Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).
*/
package com.csvdatahandling.basicproblems.readandcountrow;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCount {
    public static void main(String[] args) {

        // file path
        String filePath = "src/main/java/com/csvdatahandling/basicproblems/readandcountrow/File.csv";
        // variable to keep track of variable
        int countRow =0;
        // using try with resource
        try(CSVReader br = new CSVReader(new FileReader(filePath)) ){

               String []nextline=br.readNext();
               while((nextline = br.readNext()) != null){
                   countRow++;
               }
            System.out.println("Number of rows in the file except header : "+(countRow-1));
          // catching exception at runtime
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
