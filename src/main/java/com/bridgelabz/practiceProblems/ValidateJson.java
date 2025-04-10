package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ValidateJson {
    public static void validation(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonFormat = "{\"name\":\"Siddharth\",\"age\":23,\"email\":\"sid@gmail.com\",\"address\":\"Delhi\",\"university\":\"Chitkara University\"}";
        JsonNode node = mapper.readTree(new File(path));
        System.out.println(node);
    }
    public static void main(String[] args) {
        try{
            validation("D:\\8th sem\\bridgelabz.workspace\\java-json\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\josnFile.json");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
