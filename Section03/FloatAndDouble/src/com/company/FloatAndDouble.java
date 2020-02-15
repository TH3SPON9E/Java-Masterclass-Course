package com.company;

public class FloatAndDouble {

    public static void main(String[] args) {
        // Floating Point Numbers have a fractoinal part with decimal point

        // Float (32 bit)
        float myFloatMin = Float.MIN_VALUE;
        float myFloatMax = Float.MAX_VALUE;
        //System.out.println("Float Min Value: " + myFloatMin);
        //System.out.println("Float Max Value: " + myFloatMax);

        // Double (64bit)
        double myDoubleMin = Double.MIN_VALUE;
        double myDoubleMax = Double.MAX_VALUE;
        //System.out.println("Double Min Value: " + myDoubleMin);
        //System.out.println("Double Max Value: " + myDoubleMax);

        int myIntValue = 5 / 3;
        // Casting Float Variable
        float myFloatValue = (float)(5.25);
        // Or add F to the end to declare value as Float
        float myFloatValuePreferred = 5F / 3F;
        double myDoubleValue = 5D / 3D;
        double myDoubleValueWithoutD = 5.00 / 3.00;

        //System.out.println("MyIntValue: " + myIntValue);
        //System.out.println("MyFloatValue: " + myFloatValuePreferred);
        //System.out.println("MyDoubleValue: " + myDoubleValue);
        //System.out.println("MyDouble Value Without D: " + myDoubleValueWithoutD);

        int pounds = 180;
        double kg = pounds * 0.45359237;
        System.out.println("Pouns: " + pounds);
        System.out.println("Converted pounds to kilograms.");
        System.out.println("Kilograms: " + kg);

        double pi = 3.1415927;
        double radius = 10;
        double area = pi * (radius * radius);
        System.out.println("Area of circle with radius " + radius + ": " + area);
    }
}
