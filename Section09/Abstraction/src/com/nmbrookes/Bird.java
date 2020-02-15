package com.nmbrookes;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is chirping");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is silently sleeping");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
