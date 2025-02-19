//Convert a list of Java objects into a JSON array.
package com.json.practiceproblems.javaobjecttojsonarray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JavaObjectToJsonArray {
    public static void main(String[] args) {
        List<Student>student = new ArrayList<>();
        //List of the student
        Student st1 = new Student(101,"Vivek","vivek@gmail.com");
        Student st2 = new Student(102,"Suraj","suraj@gmail.com");
        Student st3 = new Student(103,"Pratham","pratham@gmail.com");
        Student st4 = new Student(104,"Kajal","kajal@gmail.com");
        //Add student to the list
        student.add(st1);
        student.add(st2);
        student.add(st3);
        student.add(st4);


        //to change to the JSON object
        ObjectMapper objectMapper = new ObjectMapper();
        try{
         //   String jsonString = objectMapper.writeValueAsString(student);
            //To make code with more readable form
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
