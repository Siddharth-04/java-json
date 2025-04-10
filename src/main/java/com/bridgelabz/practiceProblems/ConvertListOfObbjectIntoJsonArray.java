package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;

class User{
    String name;
    String email;
    int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ConvertListOfObbjectIntoJsonArray {
    public static void convertObjectIntoJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<User> array = new ArrayList<User>();

        array.add(new User("Siddharth", "siddharth@gmail.com", 23));
        array.add(new User("Ishaan", "ishaan@gmail.com", 22));
        array.add(new User("Dhruv", "dhruv@gmail.com", 23));

        JSONArray jsonArray = new JSONArray();

        for(User u : array){
            jsonArray.put(mapper.writeValueAsString(u));
        }

        System.out.println(jsonArray.toString(2));
    }
    public static void main(String[] args) {
        try{
            convertObjectIntoJson();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//[
//  "{\"name\":\"Siddharth\",\"email\":\"siddharth@gmail.com\",\"age\":23}",
//  "{\"name\":\"Ishaan\",\"email\":\"ishaan@gmail.com\",\"age\":22}",
//  "{\"name\":\"Dhruv\",\"email\":\"dhruv@gmail.com\",\"age\":23}"
//]