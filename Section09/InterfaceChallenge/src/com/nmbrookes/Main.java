package com.nmbrookes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player playerOne = new Player("PlayerOne", 10, 50);
        System.out.println(playerOne.toString());
        saveObject(playerOne);
        playerOne.setName("Mr Robot");
        System.out.println(playerOne.toString());
        saveObject(playerOne);
        System.out.println(playerOne.toString());

//        ISaveable zombie = new Monster("Zombie", 20, 100);
        Monster zombie = new Monster("Zombie", 20, 100);
        System.out.println(zombie.toString());
        saveObject(zombie);
        System.out.println("Strength = " + zombie.getStrength());
//        System.out.println("Strengh = " + ((Monster) zombie).getStrength());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "0 - To Quit\n" +
                "1 - To enter new String");

        while(!quit) {
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter new string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }

        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
