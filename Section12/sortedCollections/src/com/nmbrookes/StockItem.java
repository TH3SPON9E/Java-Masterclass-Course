package com.nmbrookes;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you would not do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }
        if(obj == null || (obj.getClass()) != this.getClass()) {
            return false;
        }
        return this.name.equals(((StockItem)obj).getName());
    }

    @Override
    public int compareTo(StockItem item) {
        System.out.println("Entering StockItem.compareTo");
        if(this == item) {
            return 0;
        }
        if(item != null) {
            return this.name.compareTo(item.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " price: " + this.price;
    }
}
