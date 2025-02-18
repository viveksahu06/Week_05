/*Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.
*/
package com.csvdatahandling.basicproblems.writedatatocsvfile;

public class WriteDataToCSVFile {
    public static void main(String[] args) {
        //file path
        String filePath = "src/main/java/com/csvdatahandling/basicproblems/writedatatocsvfile/Write.csv";
        //calling method to writing the csv file using bufferReader
          WriteCsvFileUsingBufferWriter.writingUsingBufferWriter(filePath);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        //calling method to writing the csv file using OpenCsv
        WriteCSVFileUsingOpenCSV.writingUsingOpenCsv(filePath);
        System.out.println();

    }
}
