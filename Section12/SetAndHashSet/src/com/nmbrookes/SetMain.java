package com.nmbrookes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares.");
        System.out.println("There are " + cubes.size() + " cubes.");

        // Creating new HashSet does not effect the original Set
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        for(int i: intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s: words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        Set<String> divine = new HashSet<>();
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - Divine");
        Set<String> dif1 = new HashSet<>(nature);
        dif1.removeAll(divine);

        printSet(dif1);

        System.out.println("Divine - Nature");
        Set<String> dif2 = new HashSet<>(divine);
        dif2.removeAll(nature);

        printSet(dif2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric Difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)) {
            System.out.println("Divine is a subset of nature");
        }
        if(nature.containsAll(intersectionTest)) {
            System.out.println("Intersection is a subset of nature");
        }
        if(divine.containsAll(intersectionTest)) {
            System.out.println("Intersection is a subset of divine");
        }

    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
