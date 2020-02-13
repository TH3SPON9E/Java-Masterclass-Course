package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        Player playerOne = new Player();
        //Changing variable names they need to be changed everywhere they are used.
//        playerOne.name = "Parzival";
//        playerOne.health = 100;
        // Forgetting to initialise the class variables, cannot guarantee that the fields are set
        // when the class is initialised.
        // Cannot call any validation
        playerOne.weapon = "Sword";
        int damage = 50;
        playerOne.looseHealth(damage);
        System.out.println("Remaining health = " + playerOne.getHealth());
        // Overriding class variable that allow you to alter the fields directly.
        playerOne.health = 200;
        playerOne.looseHealth(damage);
        System.out.println("Remaining health = " + playerOne.getHealth());

        System.out.println("********************");

        EncapulatedPlayer playerTwo = new EncapulatedPlayer("Zed", 150, "Gun");
        System.out.println("Player Health = " + playerTwo.getHealth());
        playerTwo.looseHealth(50);
        System.out.println("Remaining health = " + playerTwo.getHealth());
        playerTwo.looseHealth(100);
        System.out.println("Remaining health = " + playerTwo.getHealth());
    }
}
