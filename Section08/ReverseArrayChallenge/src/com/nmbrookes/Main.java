package com.nmbrookes;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Printed Array");
        printArray(array);
        reverseArray(array);
        System.out.println("Printed Reverse Array");
        printArray(array);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " Integers.");
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

    public static void reverseArray(int[] array) {
        int index = array.length - 1;
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[index - i];
            array[index - i] = temp;
        }
    }
}
