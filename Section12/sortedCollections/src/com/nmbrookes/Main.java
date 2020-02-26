package com.nmbrookes;


import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);
        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);
        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);
        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket matthewsBasket = new Basket("Matthew");

        sellItem(matthewsBasket, "Car", 1);
        System.out.println(matthewsBasket);

        sellItem(matthewsBasket, "Car", 1);
        System.out.println(matthewsBasket);

        if(sellItem(matthewsBasket, "Car", 1) != 1) {
            System.out.println("No more stock for car");
        }

        sellItem(matthewsBasket, "Spanner", 1);
        sellItem(matthewsBasket, "Juice", 4);
        sellItem(matthewsBasket, "Cup", 12);
        sellItem(matthewsBasket, "Bread", 1);

        Basket tomsBasket = new Basket("Tom");
        sellItem(tomsBasket, "Cup", 100);
        sellItem(tomsBasket, "Juice", 5);
        removeItem(tomsBasket, "Cup", 1);
        removeItem(tomsBasket, "Cup", 3);
        System.out.println(tomsBasket);

        removeItem(matthewsBasket, "Car", 1);
        removeItem(matthewsBasket, "Cup", 9);
        removeItem(matthewsBasket, "Car", 1);
        System.out.println("Cars removed: " + removeItem(matthewsBasket, "Car", 1)); // Should not remove anything
        System.out.println(matthewsBasket);

        // Remove all items from Matthews Basket
        removeItem(matthewsBasket, "Bread", 1);
        removeItem(matthewsBasket, "Juice", 4);
        removeItem(matthewsBasket, "Cup", 3);
        System.out.println(matthewsBasket);

        System.out.println("Display stock before checkout");
        System.out.println(stockList);
        System.out.println(matthewsBasket);
        System.out.println(tomsBasket);

        System.out.println("Display stock after checkout");
        System.out.println(tomsBasket);
        System.out.println(stockList);
        checkout(tomsBasket);
        System.out.println(tomsBasket);
        System.out.println(stockList);

//        for(Map.Entry<String, Double> price: stockList.priceList().entrySet()) {
//            System.out.println(price.getKey() + " costs: " + price.getValue());
//        }
        checkout(matthewsBasket);
        System.out.println(matthewsBasket);

        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // Retrieve item from stockList
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // Retrieve item from stockList
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.removeReservedStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
