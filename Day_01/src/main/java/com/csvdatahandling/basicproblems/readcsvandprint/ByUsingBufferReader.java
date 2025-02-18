package com.csvdatahandling.basicproblems.readcsvandprint;

import java.io.BufferedReader;
import java.io.FileReader;

public class ByUsingBufferReader {
    public static void byUsingBufferReader(String filepath) {
        //Try block
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line=br.readLine();
            while (line!=null ){
                String []column = line.split(",");
                System.out.println("ID : "+column[0]+","+" NAME : "+column[1]+","+"AGE : "+column[2]+","+"MARKS : "+column[3]);
                line = br.readLine();
            }
        }
        //Catch Block
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
