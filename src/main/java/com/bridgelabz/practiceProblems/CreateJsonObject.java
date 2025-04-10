package com.bridgelabz.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("Name","Siddharth");
        obj.put("Age",23);

        JSONArray array = new JSONArray();
        array.put("Physics");
        array.put("Chemistry");
        array.put("Mathematics");
        array.put("Physical Education");

        obj.put("Subject",array);

        System.out.println(obj);
    }
}
//{"Age":23,"Subject":["Physics","Chemistry","Mathematics","Physical Education"],"Name":"Siddharth"}