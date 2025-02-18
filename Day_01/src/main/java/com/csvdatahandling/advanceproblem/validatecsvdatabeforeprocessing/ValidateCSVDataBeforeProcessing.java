/*8️⃣ Validate CSV Data Before Processing
Ensure that the "Email" column follows a valid email format using regex.
Ensure that "Phone Numbers" contain exactly 10 digits.
Print any invalid rows with an error message.
*/
package com.csvdatahandling.advanceproblem.validatecsvdatabeforeprocessing;

import java.io.FileNotFoundException;

import static com.csvdatahandling.advanceproblem.validatecsvdatabeforeprocessing.ValidatingCSVDataBeforeProcessing.validatingCSVDataBeforeProcessing;

public class ValidateCSVDataBeforeProcessing {
    public static void main(String[] args) throws FileNotFoundException {
        // File path
        String filePath = "src/main/java/com/csvdatahandling/advancedproblems/validatecsvdatabeforeprocessing/employee.csv";
        // Calling method
        validatingCSVDataBeforeProcessing(filePath);
    }
}
