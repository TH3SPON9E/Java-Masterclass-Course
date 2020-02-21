package com.nmbrookes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        tempExit.put("Q", 0);
        locations.put(0, new Location(0, "You are sitting in front of a computer playing a Java game", null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 5);
        tempExit.put("D", 3);
        tempExit.put("S", 4);
        tempExit.put("A", 2);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("A", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        tempExit.put("A", 2);
        locations.put(4, new Location(4, "You are in a valley beside a steam", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("A", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "D");
        vocabulary.put("WEST", "A");

        System.out.println("Controls:");

        int loc = 1;
        while(true) {
            System.out.println("North (W), South (S), East (D), West (A), Quit (Q)");
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();

            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            }
            else {
                System.out.println("You cannot go in this direction");
            }
        }
    }
}
