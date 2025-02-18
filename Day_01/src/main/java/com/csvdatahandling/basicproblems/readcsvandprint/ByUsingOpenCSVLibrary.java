package com.csvdatahandling.basicproblems.readcsvandprint;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ByUsingOpenCSVLibrary {
    public static void byUsingOpenCSV(String filePath){

        //Try block
        try(CSVReader csvreader = new CSVReader(new FileReader(filePath))){
            List<String[]> l = csvreader.readAll();
            Iterator<String[]> i = l.iterator();
            while(i.hasNext()){
                String []row=i.next();
                System.out.println(String.join(",",row));
            }

         // to catch the exception
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
