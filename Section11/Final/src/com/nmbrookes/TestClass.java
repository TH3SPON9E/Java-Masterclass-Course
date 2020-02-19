package com.nmbrookes;

public class TestClass {
    private static int classCounter = 0;
    // This variable, once set, cannot be changed
    private final String name;
    // Declares a variable that cannot be changed. Each class has a variable each.
    public final int instanceNumber;

    public TestClass(String name) {
        // Sets the variable to a value which can no longer be changed
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
