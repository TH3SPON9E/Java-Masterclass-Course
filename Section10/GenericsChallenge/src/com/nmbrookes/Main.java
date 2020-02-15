package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> premiereLeague = new League<>("Premiere League");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> manUnited = new Team<>("Manchester United");

        premiereLeague.add(liverpool);
        premiereLeague.add(chelsea);
        premiereLeague.add(manUnited);

        liverpool.addPlayer(new FootballPlayer("Steven Gerrard"));
        chelsea.addPlayer(new FootballPlayer("John Terry"));
        manUnited.addPlayer(new FootballPlayer("Ryan Giggs"));

        System.out.println("===========================");

        liverpool.matchResult(chelsea, 2, 1);
        manUnited.matchResult(chelsea, 5, 3);
        liverpool.matchResult(manUnited, 0, 2);

        System.out.println("===========================");

        System.out.println(liverpool.getName() + " played: " + liverpool.getPlayed());
        System.out.println(chelsea.getName() + " played: " + chelsea.getPlayed());
        System.out.println(manUnited.getName() + " played: " + manUnited.getPlayed());

        System.out.println("===========================");

        System.out.println(liverpool.getName() + " ranking: " + liverpool.ranking());
        System.out.println(chelsea.getName() + " ranking: " + chelsea.ranking());
        System.out.println(manUnited.getName() + " ranking: " + manUnited.ranking());

        System.out.println("===========================");

        premiereLeague.showLeagueTable();
    }
}
