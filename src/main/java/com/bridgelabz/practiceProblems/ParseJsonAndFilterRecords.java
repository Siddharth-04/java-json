package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ParseJsonAndFilterRecords {
    public static void parseAndFilter() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("D:\\8th sem\\bridgelabz.workspace\\java-json\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\josnDataForParsing.json"));

        for(JsonNode record : node) {
            String age = record.get("age").toString();

            if(age.compareTo("25") > 0){
                System.out.println(record.toString());
            }
        }
    }
    public static void main(String[] args) {
        try{
            parseAndFilter();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
//{"name":"Anil","age":31}
//{"name":"Digvijay","age":32}