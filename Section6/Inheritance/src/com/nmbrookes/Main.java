package com.nmbrookes;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Collie", 8, 20, 2, 4, 1, 20, "Short");
//        dog.eat();
        dog.walk();
        dog.run();
    }
}
