package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Odean", 8, 12);
//        theatre.getSeats();

        // Reserve seat
        if(theatre.reserveSeat("D13")) {
            System.out.println("Please pay.");
        }
        else {
            System.out.println("Sorry, seat is taken.");
        }

        // Try reserving a reserved seat
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay.");
        }
        else {
            System.out.println("Sorry, seat is taken.");
        }

        // Try reserving a seat that doesn't exist
        if(theatre.reserveSeat("Z11")) {
            System.out.println("Please pay.");
        }
        else {
            System.out.println("Sorry, seat is taken.");
        }
    }
}
