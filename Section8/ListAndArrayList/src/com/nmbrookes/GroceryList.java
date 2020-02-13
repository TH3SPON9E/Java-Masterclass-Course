package com.nmbrookes;

import java .util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String item, String newItem) {
        int position = findGroceryItem(item);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified to " + newItem);
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
        else {
            System.out.println(item + " not found");
        }
    }

    private void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " removed.");
    }

    public boolean onFile(String item) {
        int position = findGroceryItem(item);
        return position >= 0;
    }

    private int findGroceryItem(String item) {
        return groceryList.indexOf(item);
    }
}
