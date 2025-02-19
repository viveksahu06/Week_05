package com.json.practiceproblems.validatejsonstructure;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidateJsonStructure {
    public static void main(String[] args) throws IOException, ProcessingException {
        //Creating an ObjectMapper instance for reading JSON data
        ObjectMapper objectMapper = new ObjectMapper();

        //Reading the JSON schema file
        JsonNode readNode = objectMapper.readTree(new File("src/main/java/com/json/practiceproblems/validatejsonstructure/schema.json"));

        //Creating a JSON Schema Factory instance
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();

        //Generating the JSON Schema object from the readNode (schema definition)
        JsonSchema schema = factory.getJsonSchema(readNode);

        //Reading the JSON data file to validate
        JsonNode jsonData = objectMapper.readTree(new File("src/main/java/com/json/practiceproblems/validatejsonstructure/data.json"));

        //Validate the JSON data against the schema
        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("JSON data is in accurate form");
        } else {
            System.out.println("Not in correct form");
        }
    }
}
