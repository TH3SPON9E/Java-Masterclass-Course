package com.nmbrookes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String modelLowerCase = model.toLowerCase();
        if(modelLowerCase.equals("carrera") || modelLowerCase.equals("mondeo")) {
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
