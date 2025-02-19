package com.json.practiceproblems.objecttojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJSON {
    public static void main(String[] args) {
        Car car = new Car(101, "BMW", 2300000, "2024");
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            //write object as string
            String carJson = objectMapper.writeValueAsString(car);
            System.out.println(carJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
