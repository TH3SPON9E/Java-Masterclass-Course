package com.nmbrookes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Odean", 8, 12);
        // Make a new list with separate references but referencing the same object
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        // Reserve using one list and test using other list. Both list refer to same object
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        }
        else {
            System.out.println("Seat reserved");
        }

        // Reverse the order of one list but not the other
        Collections.reverse(seatCopy);
        System.out.println("======Seats Copy========");
        printList(seatCopy);
        System.out.println("=======Original Seats=======");
        printList(theatre.seats);

        // Shuffle the list
        System.out.println("=======Shuffle List==========");
        Collections.shuffle(seatCopy);
        printList(seatCopy);

        // Max and Min (Uses compareTo() method)
        Theatre.Seat minSeat = Collections.min(theatre.seats);
        System.out.println("Min Seat: " + minSeat.getSeatNumber());
        Theatre.Seat maxSeat = Collections.max(theatre.seats);
        System.out.println("Max Seat: " + maxSeat.getSeatNumber());

        // Using the Collections swap method to sort a list back in order.
        System.out.println("========Seat Copy after Sorting with Collections.swap=======");
        sortList(seatCopy);
        printList(seatCopy);

        // Collections copy method requirs the list to have enough capacity to store all elements
        // theatre.seats.size() get the size of the array and sets a new array to that size
        // but the ArrayList does not have any elements in it to allow the copy.

//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats);


//        // Reserve seat
//        if(theatre.reserveSeat("H12")) {
//            System.out.println("Please pay.");
//        }
//        else {
//            System.out.println("Sorry, seat is taken.");
//        }
//
//        // Try reserving a reserved seat twice
//        if(theatre.reserveSeat("D12")) {
//            System.out.println("Please pay.");
//        }
//        else {
//            System.out.println("Sorry, seat is taken.");
//        }
//        if(theatre.reserveSeat("D12")) {
//            System.out.println("Please pay.");
//        }
//        else {
//            System.out.println("Sorry, seat is taken.");
//        }
//
//        // Try reserving a seat that doesn't exist
//        if(theatre.reserveSeat("Z11")) {
//            System.out.println("Please pay.");
//        }
//        else {
//            System.out.println("Sorry, seat is taken.");
//        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.print(seat.getSeatNumber() + " ");
        }
        System.out.println();
        System.out.println("=========================================================");
    }

    // Uses Collection Swap method to swap to elements within a list
    // This loop over the list getting the first element and then the element next to it
    // comparing them with the compareTo() method and swapping them if needed.
    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
