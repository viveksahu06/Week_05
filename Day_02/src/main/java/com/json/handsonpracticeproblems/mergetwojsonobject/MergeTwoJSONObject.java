package com.json.handsonpracticeproblems.mergetwojsonobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

public class MergeTwoJSONObject {
    public static void main(String[] args) {
        //Student 1 data
        JSONObject student1=new JSONObject();
        student1.put("name","Pratham Raj");
        student1.put("age",21);

        //Student 2 data
        JSONObject student2=new JSONObject();
        student2.put("name","Suraj Patel");
        student2.put("age",22);

        JSONObject mergedStudent=new JSONObject(student1);
        mergedStudent.put("Student1",student1);
        mergedStudent.put("Student2",student2);
        System.out.println(mergedStudent.toString(4));
    }
}
