package com.nmbrookes;

// Static Initialisation Block

public class SIBTest {
    public static final String owner;

    // In this class the static blocks are called in order before the constructor is called

    static {
        owner = "Will";
        System.out.println("SIBTest static initialisation block called");
    }

    // Constructor is called after all static block

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("Second initialisation block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
