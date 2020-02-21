package com.nmbrookes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        locations.put(0, new Location(0, "You are sitting in front of a computer playing a Java game"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a steam"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 5);
        locations.get(1).addExit("D", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("A", 2);
//        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("W", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("A", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("W", 1);
        locations.get(4).addExit("A", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("A", 2);
//        locations.get(5).addExit("Q", 0);

        System.out.println("Controls:");
        System.out.println("North (W), South (S), East (D), West (A), Quit (Q)");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.print("Available exits are: ");
//            for(String exit: exits.keySet()) {
//                if(exit.equalsIgnoreCase("w")) {
//                    System.out.print("North (W) ");
//                }
//                else if(exit.equalsIgnoreCase("s")) {
//                    System.out.print("South (S) ");
//                }
//                else if(exit.equalsIgnoreCase("a")) {
//                    System.out.print("West (A) ");
//                }
//                else if(exit.equalsIgnoreCase("d")) {
//                    System.out.print("East (D) ");
//                }
//                else {
//                    System.out.print("Quit (Q) ");
//                }
//            }
//            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            }
            else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
