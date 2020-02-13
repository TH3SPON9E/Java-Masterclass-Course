package com.nmbrookes;

public class Main {
    public static void main(String[] args) {
        Mondeo mondeo = new Mondeo(36);
        mondeo.steer(45);
        mondeo.accelerate(30);
        mondeo.accelerate(20);
        mondeo.accelerate(-42);
    }
}
