package com.club.fotbal.model;

public class Jucatori {
    private String nume;
    private int salariu;
    private String echipa;
    private String pozitie;

    public Jucatori(String nume, int salariu, String echipa, String pozitie) {
        this.nume = nume;
        this.salariu = salariu;
        this.echipa = echipa;
        this.pozitie = pozitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipat(String echipa) {
        this.echipa = echipa;
    }

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }
}