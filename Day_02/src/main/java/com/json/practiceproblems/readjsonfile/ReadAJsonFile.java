package com.json.practiceproblems.readjsonfile;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadAJsonFile {
    public static void main(String[] args) {
       String path ="src/main/java/com/json/practiceproblems/readjsonfile/data.json";
        ObjectMapper obj = new ObjectMapper();
        try {
            // Read JSON file into a List of PersonData
            List<PersonData> data = obj.readValue(new File(path), new TypeReference<List<PersonData>>() {});
            //new TypeReference<List<PersonData>>() {} used for handling multiple data in json file
            //if there single data is available simply write name.class

            // Print stored data
            for (PersonData person : data) {
//                System.out.println(person.getName());
//                System.out.println(person.getEmail());
                System.out.println(person);
            }
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
