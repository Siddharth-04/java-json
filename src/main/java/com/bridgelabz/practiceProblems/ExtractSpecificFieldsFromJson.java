package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class Student{
    String name;
    String age;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class ExtractSpecificFieldsFromJson {
    public static void getFields() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("D:\\8th sem\\bridgelabz.workspace\\java-json\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\josnFile.json"));
        System.out.println("Name : "+jsonNode.path("name").asText());
        System.out.println("Age : " + jsonNode.path("age").asText());
        System.out.println("Email : " + jsonNode.path("email").asText());
    }
    public static void main(String[] args) {
        try{
            getFields();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//Name : Siddharth
//Age : 21
//Email : sid@gmail.com