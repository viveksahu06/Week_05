//Parse JSON and filter only those records where age > 25.
package com.json.practiceproblems.parseajson;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.practiceproblems.readjsonfile.PersonData;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ParseAJSONApplyFilter {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            //list to add person data
            List<PersonData> datas = objectMapper.readValue(new File("src/main/java/com/json/practiceproblems/parseajson/data.json"), new TypeReference<List<PersonData>>() {});
            //Iterate over person data
            for(PersonData data : datas){
                if(data.getAge()>25){
                    System.out.println(data);
                }
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
