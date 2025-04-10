package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Car{
    String name;
    String model;
    String color;

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class ConvertJavaObjectIntoJson {
    public static void convertJavaObjectIntoJson() throws Exception {
        Car car = new Car("Toyota", "Innova", "Black");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(car);
        System.out.println(json);
    }
    public static void main(String[] args) {
        try{
            convertJavaObjectIntoJson();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
