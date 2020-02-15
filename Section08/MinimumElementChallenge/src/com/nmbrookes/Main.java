package com.nmbrookes;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        printArray(array);
        System.out.println("Minimum Integer in array: " + findMin(array));

    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " Integers.\r");
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
