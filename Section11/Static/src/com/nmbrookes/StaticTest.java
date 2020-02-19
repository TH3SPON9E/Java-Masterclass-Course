package com.nmbrookes;

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    // Static method: can be accessed without creating an object of this class: StaticTest
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
