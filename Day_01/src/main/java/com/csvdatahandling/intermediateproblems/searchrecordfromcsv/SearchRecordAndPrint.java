package com.csvdatahandling.intermediateproblems.searchrecordfromcsv;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecordAndPrint {
    public static void searchAndPrint(String filepath){
        // try with resource
        //reading the file and searching the employee name data
           try(CSVReader reader = new CSVReader(new FileReader(filepath))){
               String []row ;
               Scanner sc = new Scanner(System.in);
               System.out.print("Enter the employee name to get their data : ");
               String emplyoeeName =sc.nextLine();
               boolean flag =true;
               while((row=reader.readNext())!=null){
                  if(emplyoeeName.equals(row[1])){
                      System.out.println("ID : "+row[0]+","+" NAME : "+row[1]+","+"DEPARTMENT : "+row[2]+","+"SALARY : "+row[3]);
                  flag =false;
                  }
               }
               if(flag){
                   System.out.println("Record not found");
               }
           }catch(FileNotFoundException f){
               f.getMessage();
           }catch(IOException e){
               e.printStackTrace();
           }catch(Exception e){
               e.printStackTrace();
           }
    }
}
