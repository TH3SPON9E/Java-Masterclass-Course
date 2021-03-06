package com.nmbrookes;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled high-level object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("Basic", "Beginners All Purpose Symbolic Instruction Code");

        System.out.println(languages.put("Language", "Test to show that it was added for first time, returns null"));


        System.out.println("Getting the original: " + languages.get("Java"));
        languages.put("Java", "This course is about Java");
        System.out.println("Getting after changing value: " + languages.get("Java"));


        // containsKey() is one way to test if the key exists in the map
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }
        // If not you could add it at this time
        else {
            System.out.println("Java was added to the map");
            languages.put("Java", "Java OOP");
        }

        // Removing item (will return true/false)
        languages.remove("Basic");
        // Checking key and value, both have to match te be removed
        if(languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("Algol not removed, key/value par not found");
        }

        // Replace
        if(languages.replace("Language", "This will not work" ,"A generic language used in this replace method for testing")) {
            System.out.println("Language replaced");
        }
        else {
            System.out.println("Language not replaced");
        }
        System.out.println(languages.replace("Language2", "This language does not exist so will return null"));

        // Printing map (No order with HashMap)
        printMap(languages);

    }

    private static void printMap(Map<String, String> map) {
        System.out.println("======================================");
        for(String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("======================================");
    }
}
