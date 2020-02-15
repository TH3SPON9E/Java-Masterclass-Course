package com.nmbrookes;

public class EncapulatedPlayer {
    private String name;
//    private int health = 100;
    private int healthPoints = 100;
    private String weapon;

    public EncapulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.healthPoints = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.healthPoints -= damage;
        if(this.healthPoints <= 0) {
            this.healthPoints = 0;
            System.out.println("Player Died");
            // Reduce lives of player
        }
    }

    public int getHealth() {
        return healthPoints;
    }
}
