package com.nmbrookes;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "White Roll", "Sausage & Bacon", 10.5);
        super.addItem1("Chips", 1.95);
        super.addItem2("Drink", 1.5);
    }

    @Override
    public void addItem1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addItem2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addItem3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addItem4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }
}
