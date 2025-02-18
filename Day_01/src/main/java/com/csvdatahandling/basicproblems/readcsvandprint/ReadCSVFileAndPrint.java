/*Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.
*/
package com.csvdatahandling.basicproblems.readcsvandprint;

public class ReadCSVFileAndPrint {
    public static void main(String[] args) {
        // file apth
   String filepath = "src/main/java/com/csvdatahandling/basicproblems/readcsvandprint/CSVData.csv";
   //calling method to read the csv file using bufferReader
   ByUsingBufferReader.byUsingBufferReader(filepath);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        //calling method to read the csv file using Opencsv
        ByUsingOpenCSVLibrary.byUsingOpenCSV(filepath);

    }
}
