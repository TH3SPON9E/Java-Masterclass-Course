package com.nmbrookes;

public class AreaCalculator {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 4.0));
        System.out.println(area(4.0, -1));
    }

    public static double area(double radius) {
        if(radius >= 0) {
            return PI * (radius * radius);
        }
        else {
            return -1;
        }
    }

    public static double area(double x, double y) {
        if(x >= 0 && y >= 0) {
            return x * y;
        }
        else {
            return -1;
        }
    }
}
