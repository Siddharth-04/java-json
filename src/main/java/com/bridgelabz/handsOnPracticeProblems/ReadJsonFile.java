package com.bridgelabz.handsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonFile {
    public static void readValues(String fileName) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File(fileName));
        System.out.println(node.toString());
    }
    public static void main(String[] args) {
       try{
           readValues("D:\\8th sem\\bridgelabz.workspace\\java-json\\src\\main\\java\\com\\bridgelabz\\handsOnPracticeProblems\\jsonFIle.json");
       }catch(Exception e){
           System.out.println(e);
       }
    }
}
//{"name":"Siddharth","age":21,"email":"sid@gmail.com","address":"Delhi","university":"Chitkara"}