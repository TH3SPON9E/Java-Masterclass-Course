package com.nmbrookes;

// Scope ensures the local variable with a narrow scope is used before accessing global variable
// Java checks the current block to see if the variable is declares and using this one
// If not Java checks the next enclosing block and so on until finding the variable it needs.

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree);

//        System.out.println("scopeInstance varOne = " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//
//        System.out.println("**************************");
//
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
