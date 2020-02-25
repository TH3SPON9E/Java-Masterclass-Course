package com.nmbrookes;

public class DogMain {
    public static void main(String[] args) {
        Collie ben = new Collie("Ben");
        Dog ben2 = new Dog("Ben");

        System.out.println(ben2.equals(ben));
        System.out.println(ben.equals(ben2));
    }
}
