package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer john = new FootballPlayer("John");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer mark = new SoccerPlayer("Mark");

        Team<FootballPlayer> leedsTeam = new Team<>("Leeds");
        leedsTeam.addPlayer(joe);

        Team<BaseballPlayer> cubsTeam = new Team<>("Chicago Cubs");
        cubsTeam.addPlayer(pat);

        Team<FootballPlayer> chelseaTeam = new Team<>("Chelsea");
        chelseaTeam.addPlayer(john);

        Team<FootballPlayer> liverpoolTeam = new Team<>("Liverpool");
        liverpoolTeam.addPlayer(john);

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer");
        soccerTeam.addPlayer(mark);

        System.out.println("Number of players in team " + leedsTeam.getName() +
                ": " + leedsTeam.getNumPlayers());

        leedsTeam.matchResult(chelseaTeam, 3, 2);
        leedsTeam.matchResult(chelseaTeam, 2, 2);
        leedsTeam.matchResult(liverpoolTeam, 1, 2);
        chelseaTeam.matchResult(liverpoolTeam, 5, 5);

        System.out.println(leedsTeam.getName() + " ranking: " + leedsTeam.ranking());
        System.out.println(chelseaTeam.getName() + " ranking: " + chelseaTeam.ranking());
        System.out.println(liverpoolTeam.getName() + " ranking: " + liverpoolTeam.ranking());
        System.out.println(leedsTeam.getName() + " played games: " + leedsTeam.getPlayed());
        System.out.println(chelseaTeam.getName() + " played games: " + chelseaTeam.getPlayed());
        System.out.println(liverpoolTeam.getName() + " played games: " + leedsTeam.getPlayed());

        System.out.println(leedsTeam.compareTo(chelseaTeam));
        System.out.println(chelseaTeam.compareTo(leedsTeam));
        System.out.println(leedsTeam.compareTo(liverpoolTeam));

        // This cannot be run due to incompatible types of Team
//        leedsTeam.matchResult(cubsTeam, 3, 2);

    }
}
