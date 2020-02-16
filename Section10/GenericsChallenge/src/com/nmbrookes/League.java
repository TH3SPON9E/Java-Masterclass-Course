package com.nmbrookes;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            System.out.println("Team: " + team.getName() + " already exists");
            return false;
        }
        league.add(team);
        return true;
    }

    public void sortLeagueTableAlphabetically() {
        boolean flag = false;
        while(!flag) {
            flag = true;
            for (int i = 0; i < league.size() - 1; i++) {
                String currentTeamName = league.get(i).getName();
                String nextTeamName = league.get(i + 1).getName();
                if(currentTeamName.compareTo(nextTeamName) > 0) {
                    T temp = league.get(i + 1);
                    league.set(i + 1, league.get(i));
                    league.set(i, temp);
                    flag = false;
                }
            }
        }
    }

    public void sortLeagueTable() {
        boolean flag = false;
        while(!flag) {
            flag = true;
            for (int i = 0; i < league.size() - 1; i++) {
                int currentTeamPoints = league.get(i).getPoints();
                int nextTeamPoints = league.get(i + 1).getPoints();
                if(currentTeamPoints < nextTeamPoints) {
                    switchTeams(i, i + 1);
                    flag = false;
                }
                else if(currentTeamPoints == nextTeamPoints) {
                    int currentTeamGoalsFor = league.get(i).getGoalsScored();
                    int nextTeamGoalsFor = league.get(i + 1).getGoalsScored();
                    if(currentTeamGoalsFor < nextTeamGoalsFor) {
                        switchTeams(i, i + 1);
                        flag = false;
                    }
                    else if(currentTeamGoalsFor == nextTeamGoalsFor) {
                        int currentTeamGoalsAgainst = league.get(i).getGoalsAgainst();
                        int nextTeamGoalsAgainst = league.get(i + 1).getGoalsAgainst();
                        if(currentTeamGoalsAgainst > nextTeamGoalsAgainst) {
                            switchTeams(i, i + 1);
                            flag = false;
                        }
                        else if(currentTeamGoalsAgainst == nextTeamGoalsAgainst) {
                            int currentTeamGamesPlayed = league.get(i).getGamesPlayed();
                            int nextTeamGamesPlayed = league.get(i + 1).getGamesPlayed();
                            if(currentTeamGamesPlayed > nextTeamGamesPlayed) {
                                switchTeams(i, i + 1);
                                flag = false;
                            }
                            else if(currentTeamGamesPlayed == nextTeamGamesPlayed) {
                                String currentTeamName = league.get(i).getName();
                                String nextTeamName = league.get(i + 1).getName();
                                if(currentTeamName.compareTo(nextTeamName) > 0) {
                                    switchTeams(i, i + 1);
                                    flag = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void showLeagueTable() {
        System.out.println("Name: Played, For, Against, Points");
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.getPlayed() + ", " + t.getGoalsScored() + ", " + t.getGoalsAgainst() + ", " + t.getPoints());
        }
    }

    private void switchTeams(int left, int right) {
        T temp = league.get(right);
        league.set(right, league.get(left));
        league.set(left, temp);
    }
}