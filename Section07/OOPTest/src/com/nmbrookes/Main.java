package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Hamburger burger1 = new Hamburger("Basic", "White", "Beef", 3.56);
        burger1.addItem1("Tomato", 0.27);
        burger1.addItem2("Lettuce", 0.75);
        burger1.addItem3("Cheese", 1.12);
        burger1.addItem4("Onion", 0.5);
        System.out.println("Hamburger Price = " + burger1.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.5);
        healthyBurger.addHealthyItem1("Chicken", 2.0);
        healthyBurger.addHealthyItem2("Egg", 2.0);
        System.out.println("Hamburger Price = " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Burger price = " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addItem1("Cheese", 1.0);
    }
}
