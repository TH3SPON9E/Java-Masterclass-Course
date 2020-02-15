package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base Car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW("X5", 8);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Ford ford = new Ford("Mondeo", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Porsche porsche = new Porsche("911", 8);
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());
    }
}

class Car {
    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> Engine started";
    }

    public String accelerate() {
        return "Car -> Accelerating";
    }

    public String brake() {
        return "Car -> Braking";
    }
}

class BMW extends Car {

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW -> Engine Started";
    }

    @Override
    public String accelerate() {
        return "BMW -> Accelerating";
    }

    @Override
    public String brake() {
        return "BMW -> Braking";
    }
}

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> Engine Started";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerating";
    }

    @Override
    public String brake() {
        return "Ford -> Braking";
    }
}

class Porsche extends Car {

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    // You can use getClass() method to find the class and getSimpleName() to find the name of the method.
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Engine Started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Braking";
    }
}
