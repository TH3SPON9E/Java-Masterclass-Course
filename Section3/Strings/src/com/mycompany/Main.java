package com.mycompany;

public class Main {

    public static void main(String[] args) {
        /*
	     8 Primitive data types
	     1 byte
	     2 short
	     3 int
	     4 long
	     5 float
	     6 double
	     7 char
	     8 boolean
	     */

	     // String data type (not primitive, actually a class)
	     // String is a sequence of chars
        String myString = "This is a string";
        System.out.println("My String is: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My String is: " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My String is: " + myString);
        String numString = "250.55";

        // Adding to String together does not add values to make one
        // but concatenates them.
        numString = numString + "49.95";
        System.out.println("My String is: " + numString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("My Last String is: " + lastString);
        double numDouble = 120.47d;
        lastString = lastString + numDouble;
        System.out.println("My Last String is: " + lastString);

        /*
         String are immutable and cannot have chars removed
         once they have been created
         What is happening is that the String is recreated
         and the new String is equal to the original String
         with the added value that is provided with the
         addition operator.
        */
    }
}
