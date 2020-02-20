package com.nmbrookes;

import java.util.*;

public class Theatre {
    private final String name;
    public List<Seat> seats = new ArrayList<>();


    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {
        // A binary search start at the middle of the list and checks if the value to find is higher or lower
        // Then performs another search on that half, repeatedly until it finds a match
        // This is faster than searching every item
        // 1024 items needs 10 checks 2power10
        // 1,048,576 will be checked within 20 2power20
        // 1,073,741,824 will be checked within 30 2power30

        // This is the binary searched modified from Collections
        // Copied to demonstrate iterations by printing asterisks
        int low = 0;
        int high = seats.size()-1;

        while(low <= high) {
            System.out.print("*");
            int mid = (low + high) / 2;
            Seat midSeat = seats.get(mid);
            int comparison = midSeat.getSeatNumber().compareTo(seatNumber);

            if(comparison < 0) {
                low = mid + 1;
            }
            else if(comparison > 0) {
                high = mid - 1;
            }
            else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;

//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0) {
//            return seats.get(foundSeat).reserve();
//        }
//        else {
//            System.out.println("There is no seat: " + seatNumber);
//            return false;
//        }
    }

    // For testing
    public void getSeats() {
        for(Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if(!this.reserved) {
                reserved = true;
                System.out.println("Seat: " + seatNumber + " reserved.");
                return true;
            }
            else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                reserved = false;
                System.out.println("Reservation of Seat: " + seatNumber + " cancelled.");
                return true;
            }
            else {
                return false;
            }
        }
    }
}

