package com.nmbrookes;

// Static variables are shared with all classes that have access to this.
// The variable is not recreated on a new instance of each class

// Static methods allow use to the method with creating an object of the class the method is contained.

public class Main {
    // Has to be static in main as main class is not instantiated
    public static int multiplier = 7;

    public static void main(String[] args) {
//	    StaticTest firstInstance = new StaticTest("First Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("Second Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("Third Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println(answer);
    }

    // Method must be static so that it can be called in main as main is not an instantiated object.
    public static int multiply(int number) {
        return number * multiplier;
    }
}
