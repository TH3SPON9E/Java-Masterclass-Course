package com.nmbrookes;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }
}
