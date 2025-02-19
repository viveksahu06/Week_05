//Create a JSON object for a Student with fields: name, age, and subjects (array).

package com.json.practiceproblems.jsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObjectForStudent {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name", "Vivek Kumar Sahu");
        student.put("age", 22);

        //creating array for subject
        JSONArray subjects = new JSONArray();
        subjects.put("operating system");
        subjects.put("Data Structure and Algorithms");
        subjects.put("English");
        subjects.put("Hindi");

        //finally write subject array to original object
        student.put("subjects", subjects);

        //displaying the JSON object
        System.out.println(student.toString(4));
    }
}
