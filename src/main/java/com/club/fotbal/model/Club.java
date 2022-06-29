package com.club.fotbal.model;

public class Club {
    private String name;
    private int players;
    private int league;

    public Club(String name, int players,int league ) {
        this.name = name;
        this.players = players;
        this.league = league;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getLeague() {
        return league;
    }

    public void setLeague(int league) {
        this.league = league;
    }
}
