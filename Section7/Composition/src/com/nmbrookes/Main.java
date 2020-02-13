package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Resolution nativeResolution = new Resolution(1920, 1080);
        Case theCase = new Case("101", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("1080", "Acer", 27, nativeResolution);
        Motherboard motherboard = new Motherboard("Maximum V", "Asus", 4, 6, "v1.0");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();

        Wall wallOne = new Wall("West");
        Wall wallTwo = new Wall("East");
        Wall wallThree = new Wall("North");
        Wall wallFour = new Wall("South");
        Ceiling ceiling = new Ceiling(12, "White");
        Bed bed = new Bed("Divan", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Touch", false, 50);

        Bedroom bedroom = new Bedroom("Thomas", wallOne, wallTwo, wallThree, wallFour, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
