package com.mycompany;

public class Main {

    public static void main(String[] args) {

        // Char only holds a single character unlike String that holds many.
	    // All char are surrounded with single quotes
        char myChar = 'D';
	    // Unicode for D is 0044
        char myCharUnicode = '\u0044';
	    // Char type occupies two bytes, or 16 bits of memory
        // Unicode is an international encoding standard by each letter/symbol
        // is assigned a unique numerical number.

        // System.out.println("myChar: " + myChar);
        // System.out.println("myCharUnicode: " + myCharUnicode);


        // Boolean values all two choices, True/False, Yes/No, 1/0
        // Boolean primitive types can be set to two values only True/False
        Boolean myBooleanTrue = true;
        Boolean myBooleanFalse = false;

        System.out.println("My Boolean is: " + myBooleanTrue);
        System.out.println("My Boolean is: " + myBooleanFalse);

    }
}
