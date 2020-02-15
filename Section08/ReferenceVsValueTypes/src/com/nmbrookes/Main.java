package com.nmbrookes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = new int[5];
        int[] tempIntArray = myIntArray;

        System.out.println("First: myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("First: anotherIntValue = " + Arrays.toString(anotherIntArray));

        tempIntArray[0] = 1;

        System.out.println("Second: myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("Second: anotherIntValue = " + Arrays.toString(anotherIntArray));

        tempIntArray = anotherIntArray;

        tempIntArray[2] = 3;

        System.out.println("Third: myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("Third: anotherIntValue = " + Arrays.toString(anotherIntArray));

        modifyArray(myIntArray);

        System.out.println("Four: myIntValue = " + Arrays.toString(myIntArray));
        System.out.println("Four: anotherIntValue = " + Arrays.toString(anotherIntArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = 2;

        // Doesn't effect the array in main as new array is created.
        // This now points to a different array.
        // Array is now dereferenced
        array = new int[] {1, 2, 3, 4, 5};
    }
}
