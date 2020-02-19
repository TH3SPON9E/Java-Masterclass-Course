package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        TestClass one = new TestClass("One");
        TestClass two = new TestClass("Two");
        TestClass three = new TestClass("Three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println("******************************");

        // Provides an error as the variable is final, once set cannot be changed
//        one.instanceNumber = 4;

        // Example
        System.out.println("PI: " + Math.PI);

        // Unable to do this as Math constructor is private
//        Math m = new Math();

        System.out.println("******************************");

        int psw = 674312;
        Password password = new Password(psw);
        password.storePassword();
        password.letMeIn(123456);
        password.letMeIn(654321);
        password.letMeIn(psw);

        // This extends class override methods from Password
        // To stop this make the method final so that it cannot be overridden
//        Password extendedPassword = new ExtendedPassword(psw);
//        extendedPassword.storePassword();
//        extendedPassword.letMeIn(123456);
//        extendedPassword.letMeIn(654321);
//        extendedPassword.letMeIn(psw);


        System.out.println("******************************");

        // See class for details of order
        System.out.println("Main Method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}

// Cannot subclass class Math as class is declared as Final
// Attempting to do this would give you an error

//class Test extends Math {
//
//}
