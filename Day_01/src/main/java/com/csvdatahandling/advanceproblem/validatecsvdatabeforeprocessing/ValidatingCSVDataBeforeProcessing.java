package com.csvdatahandling.advanceproblem.validatecsvdatabeforeprocessing;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidatingCSVDataBeforeProcessing {
    // Method to validate email
    public static boolean emailValidation(String email){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.compile(regex).matcher(email).matches();
    }
    //Method to validate phone number
    public static boolean phoneNumberValidation(String phoneNum){
        String regex = "^(\\+\\d{1,3}[-. ]?)?\\d{10}$";
        return Pattern.compile(regex).matcher(phoneNum).matches();
    }
    //Method to return invalid email and phone number
    public static void validatingCSVDataBeforeProcessing(String filePath) throws FileNotFoundException {
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine = reader.readNext();;
            while((nextLine = reader.readNext()) != null){
                // Condition to check email
                if(!(emailValidation(nextLine[2]))){
                    System.out.println("Invalid email - " + nextLine[2] + " of ID - " + nextLine[0]);
                }
                // Condition to check phone number
                if(!(phoneNumberValidation(nextLine[3]))){
                    System.out.println("Invalid Phone Number - " + nextLine[3] + " of ID - " + nextLine[0]);
                }
            }
        }
        // Catch Block
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
