package com.nmbrookes;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walking");
        super.move(5); // Won't check current class for an overridden method of move()
        // The super class move() method will be called.
    }

    public void run() {
        System.out.println("Dog running");
        move(10); // The move() within this class will be called and the super class
        // method move() will not be called.
    }

    public void moveLegs(int speed) {
        System.out.println("Dog moveLegs() called");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
