package com.nmbrookes;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> premiereLeague = new League<>("Premiere League");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> manUnited = new Team<>("Manchester United");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");
        Team<FootballPlayer> manCity = new Team<>("Manchester City");
        Team<FootballPlayer> birmingham = new Team<>("Birmingham");

        premiereLeague.add(liverpool);
        premiereLeague.add(chelsea);
        premiereLeague.add(manUnited);
        premiereLeague.add(arsenal);
        premiereLeague.add(manCity);
        premiereLeague.add(birmingham);

//        manUnited.addPlayer(new FootballPlayer("Ryan Giggs"));
//        chelsea.addPlayer(new FootballPlayer("John Terry"));
//        liverpool.addPlayer(new FootballPlayer("Steven Gerrard"));
//        arsenal.addPlayer(new FootballPlayer("Andy Cole"));
//        manCity.addPlayer(new FootballPlayer("David Silva"));
//        birmingham.addPlayer(new FootballPlayer("Gary Gardner"));

        System.out.println("===========Premiere League Table (01/01/2019)================");

        premiereLeague.sortLeagueTableAlphabetically();
        premiereLeague.showLeagueTable();

//        System.out.println("============Match Results===============");

        liverpool.matchResult(arsenal, 2, 3);
        liverpool.matchResult(chelsea, 1, 1);
//        liverpool.matchResult(manUnited, 1, 4);
        liverpool.matchResult(manCity, 2, 2);
        liverpool.matchResult(birmingham, 8, 4);

        chelsea.matchResult(liverpool, 3, 2);
        chelsea.matchResult(arsenal, 2, 4);
        chelsea.matchResult(manUnited, 2, 2);
        chelsea.matchResult(manCity, 1, 1);
        chelsea.matchResult(birmingham, 3, 0);

        manUnited.matchResult(liverpool, 2, 3);
        manUnited.matchResult(chelsea, 5, 4);
        manUnited.matchResult(arsenal, 3, 4);
        manUnited.matchResult(manCity, 1, 0);
        manUnited.matchResult(birmingham, 2, 1);

        arsenal.matchResult(liverpool, 0, 0);
        arsenal.matchResult(chelsea, 1, 0);
        arsenal.matchResult(manUnited, 0, 2);
        arsenal.matchResult(manCity, 4, 1);
        arsenal.matchResult(birmingham, 2, 0);

        manCity.matchResult(liverpool, 2, 3);
        manCity.matchResult(chelsea, 1, 4);
        manCity.matchResult(manUnited, 3, 4);
        manCity.matchResult(arsenal, 0, 0);
        manCity.matchResult(birmingham, 0, 0);

        birmingham.matchResult(liverpool, 0, 1);
        birmingham.matchResult(chelsea, 0, 2);
        birmingham.matchResult(manUnited, 0, 2);
        birmingham.matchResult(manCity, 0, 2);
        birmingham.matchResult(arsenal, 0, 2);

//        System.out.println("============Played Games===============");
//
//        System.out.println(liverpool.getName() + " played: " + liverpool.getPlayed());
//        System.out.println(chelsea.getName() + " played: " + chelsea.getPlayed());
//        System.out.println(manUnited.getName() + " played: " + manUnited.getPlayed());
//        System.out.println(arsenal.getName() + " played: " + arsenal.getPlayed());
//        System.out.println(manCity.getName() + " played: " + manCity.getPlayed());
//        System.out.println(birmingham.getName() + " played: " + birmingham.getPlayed());

//        System.out.println("===========Team Points================");
//
//        System.out.println(liverpool.getName() + "'s points: " + liverpool.getPoints());
//        System.out.println(chelsea.getName() + "'s points: " + chelsea.getPoints());
//        System.out.println(manUnited.getName() + "'s points: " + manUnited.getPoints());
//        System.out.println(arsenal.getName() + "'s points: " + arsenal.getPoints());
//        System.out.println(manCity.getName() + "'s points: " + manCity.getPoints());
//        System.out.println(birmingham.getName() + "'s points: " + birmingham.getPoints());

        System.out.println("=============Premiere League Table (31/12/2019)==============");

        premiereLeague.sortLeagueTable();
        premiereLeague.showLeagueTable();
    }
}