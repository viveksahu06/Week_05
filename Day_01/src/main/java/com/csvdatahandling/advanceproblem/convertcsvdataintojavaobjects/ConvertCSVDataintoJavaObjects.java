/*9️⃣ Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.*/
package com.csvdatahandling.advanceproblem.convertcsvdataintojavaobjects;

import java.sql.SQLOutput;
import java.util.List;

import static com.csvdatahandling.advanceproblem.convertcsvdataintojavaobjects.ConvertingCSVDataintoJavaObjects.convertCSVDataintoJavaObjects;

public class ConvertCSVDataintoJavaObjects {
    public static void main(String[] args){
        // File path
        String filePath = "src/main/java/com/csvdatahandling/advanceproblem/convertcsvdataintojavaobjects/studentrecord.csv";
        // converting CSV to Java Objects and method calling
        List<Student> students = convertCSVDataintoJavaObjects(filePath);
        // Output
        System.out.println(students);
    }
}
