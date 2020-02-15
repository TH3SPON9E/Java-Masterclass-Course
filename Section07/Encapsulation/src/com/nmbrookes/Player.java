package com.nmbrookes;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player Died");
            // Reduce lives of player
        }
    }

    public int getHealth() {
        return health;
    }
}
