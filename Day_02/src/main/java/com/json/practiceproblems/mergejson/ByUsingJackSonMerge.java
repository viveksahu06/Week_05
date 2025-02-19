package com.json.practiceproblems.mergejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ByUsingJackSonMerge {
    public static void mergeTwoJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        ObjectNode obj1 = new ObjectMapper().createObjectNode();
        obj1.put("name", "Vivek Kumar Sahu");
        obj1.put("age", 22);

        ObjectNode obj2 = new ObjectMapper().createObjectNode();
        obj2.put("email","viveksahu@gmail.com");

        obj1.setAll(obj2);
        System.out.println((objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1)));
    }
}
