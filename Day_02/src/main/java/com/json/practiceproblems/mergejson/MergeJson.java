//Merge two JSON objects into one.

package com.json.practiceproblems.mergejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

public class MergeJson {
    public static void main(String[] args) throws JsonProcessingException {
        JSONObject obj1  = new JSONObject();
        obj1.put("name", "Vivek Kumar Sahu");
        obj1.put("age", 22);

        JSONObject obj2 = new JSONObject();
        obj2.put("email","viveksahu@gmail.com");
        //By using Jackson
        ByUsingJackSonMerge.mergeTwoJson();

        //By using org.json
        obj2.keySet().forEach(key-> obj1.put(key, obj2.get(key)));

        System.out.println(obj1.toString(4));



        
    }
}
