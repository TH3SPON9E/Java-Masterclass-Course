package com.nmbrookes;

public class HealthyBurger extends Hamburger {
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealthyItem1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHealthyItem2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra "  + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra "  + this.addition2Price);
        }
        return hamburgerPrice;
    }

}
