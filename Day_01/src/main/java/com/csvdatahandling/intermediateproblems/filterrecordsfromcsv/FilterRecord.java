package com.csvdatahandling.intermediateproblems.filterrecordsfromcsv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecord {
    public static void filterRecord(String path){
        // try with resource block
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line=br.readLine();
            while (line!=null ){

                String []column = line.split(",");
                // filtering the record ont the basis of marks
                if((Integer.parseInt(column[3])>=80)){
                System.out.println("ID : "+column[0]+","+" NAME : "+column[1]+","+"AGE : "+column[2]+","+"MARKS : "+column[3]);
                }
                line = br.readLine();
            }
            //catching the exception
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
