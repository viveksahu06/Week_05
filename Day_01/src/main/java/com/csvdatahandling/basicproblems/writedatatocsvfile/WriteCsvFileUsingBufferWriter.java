package com.csvdatahandling.basicproblems.writedatatocsvfile;

import java.io.*;

public class WriteCsvFileUsingBufferWriter {

    public static void writingUsingBufferWriter(String filepath){
        //try with resource block
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))){
            // writing data to csv file
            writer.write("ID,Name,Department,Salary\n");
            writer.write("101,sachin,Testing,4500000\n");
            writer.write("102,suraj,software development,5500000\n");
            writer.write("103,rishika,deployment,6500000\n");
            writer.write("104,vivek,Debugging,3500000\n");
            writer.write("105,pratham,Finance,6700000\n");

            System.out.println("Csv file updated using bufferReader");
            // catching the exception
        }catch(FileNotFoundException f){
            f.getMessage();
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }

