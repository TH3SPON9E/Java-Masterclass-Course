package com.nmbrookes;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is barking");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

}
