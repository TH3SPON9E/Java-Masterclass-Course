package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer john = new FootballPlayer("John");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer mark = new SoccerPlayer("Mark");

        Team<FootballPlayer> leedsTeam = new Team<>("Leeds");
        leedsTeam.addPlayer(joe);

        System.out.println("Number of players in team " + leedsTeam.getName() +
                ": " + leedsTeam.getNumPlayers());

        Team<BaseballPlayer> cubsTeam = new Team<>("Chicago Cubs");
        cubsTeam.addPlayer(pat);

        Team<FootballPlayer> chelseaTeam = new Team<>("Chelsea");
        chelseaTeam.addPlayer(john);

        leedsTeam.matchResult(chelseaTeam, 3, 2);
        leedsTeam.matchResult(chelseaTeam, 2, 2);

        System.out.println(leedsTeam.getName() + " ranking: " + leedsTeam.ranking());
        System.out.println(chelseaTeam.getName() + " ranking: " + chelseaTeam.ranking());
        System.out.println(leedsTeam.getName() + " played games: " + leedsTeam.getPlayed());
        System.out.println(chelseaTeam.getName() + " played games: " + chelseaTeam.getPlayed());

    }
}
