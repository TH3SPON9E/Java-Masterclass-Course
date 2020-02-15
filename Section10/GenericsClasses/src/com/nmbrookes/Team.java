package com.nmbrookes;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int draw = 0;

    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(players.contains(player)) {
            System.out.println("Player " + player.getName() + " already exists!");
            return false;
        }
        players.add(player);
        System.out.println("Player " + player.getName() + " added to team " + this.name);
        return true;
    }

    public int getNumPlayers() {
        return this.players.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            this.won++;
            message = " beat ";
        }
        else if(ourScore < theirScore) {
            this.lost++;
            message = " lost to ";
        }
        else {
            this.draw++;
            message = " drew with ";
        }
        this.played++;
        if(opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + draw;
    }

    public int getPlayed() {
        return played;
    }

    public int getLost() {
        return lost;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        }
        else if(this.ranking() < team.ranking()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
