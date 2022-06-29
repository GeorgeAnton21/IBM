package com.club.fotbal.model;

public class Player {
    private String namep;
    private int salary;
    private String team;
    private String pozition;

    public Player(String namep, int salary, String team, String pozition) {
        this.namep = namep;
        this.salary = salary;
        this.team = team;
        this.pozition = pozition;
    }

    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPozition() {
        return pozition;
    }

    public void setPozition(String pozition) {
        this.pozition = pozition;
    }
}