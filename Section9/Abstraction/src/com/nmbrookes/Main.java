package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Collie");
        dog.speak();
        dog.eat();
        dog.sleep();

        Parrot parrot = new Parrot("African Grey");
        parrot.speak();
        parrot.eat();
        parrot.fly();
        parrot.sleep();

        Penguin penguin = new Penguin("Penguin");
        penguin.speak();
        penguin.eat();
        penguin.fly();
        penguin.sleep();
    }
}
