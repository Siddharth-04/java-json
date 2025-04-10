package com.bridgelabz.practiceProblems;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("Name", "Siddharth Singh");
        obj1.put("Age", 23);
        obj1.put("Email", "siddharth@gmail.com");

        JSONObject obj2 = new JSONObject();
        obj2.put("Age",22);
        obj2.put("University", "Chitkara University");

        for(String s : obj1.keySet()){ //age will override in case of collision
            obj2.put(s,obj1.get(s));
        }

        System.out.println(obj2);
    }
}
