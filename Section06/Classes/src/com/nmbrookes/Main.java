package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car ford = new Car();
        porche.setModel("Carrera");
        System.out.println("Model of Porche is: " + porche.getModel());

        ford.setModel("Mondeo");
        System.out.println("Model of Ford is: " + ford.getModel());
    }
}
