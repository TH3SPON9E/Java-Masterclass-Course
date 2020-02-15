package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1) {
//            System.out.println("Value was 1");
//        }
//	    else if(value == 2) {
//            System.out.println("Value == 2");
//        }
//	    else {
//            System.out.println("Value was not 1 or 2");
//        }

//	    int switchValue = 6;
//
//	    switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was 3 or 4 or 5");
//                System.out.println("Value was " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4, 5");
//                break;
//        }

        char myChar = 'c';

        switch(myChar) {
            case 'a':
                System.out.println("a found");
                break;
            case 'b':
                System.out.println("b found");
                break;
            case 'c': case 'd': case 'e':
                System.out.println(myChar + " was found");
                break;
            default:
                System.out.println("a, b, c, d or e not found");
                break;
        }

        String month = "November";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "november":
                System.out.println("Nov");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
