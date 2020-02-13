package com.nmbrookes;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java .util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Glasgow");
        addInOrder(placesToVisit, "Liverpool");
        addInOrder(placesToVisit, "Bodmin");
        addInOrder(placesToVisit, "Swansea");
        addInOrder(placesToVisit, "Great Yarmouth");
        addInOrder(placesToVisit, "Southampton");
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Birmingham");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // Equal, do not add
                System.out.println(newCity + " is already included in list");
                return false;
            }
            else if(comparison > 0) {
                // newCity should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        ListIterator<String> listIterator = cities.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        printMenu();

        if(cities.isEmpty()) {
            System.out.println("No cities in list");
            return;
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
        }

        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("Reached end of holiday");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting "+ listIterator.previous());
                    }
                    else {
                        System.out.println("You are at your first destination, no previous destinations");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: " +
                "\n0 - Quit" +
                "\n1 - Next Destination" +
                "\n2 - Previous Destination" +
                "\n3 - Show Actions");
    }
}
