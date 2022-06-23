package com.club.fotbal.model;

public class Club {
    private String den;
    private int nrjuc;
    private int liga;

    public Club(String den, int nrjuc,int liga ) {
        this.den = den;
        this.nrjuc = nrjuc;
        this.liga = liga;
    }


    public String getDen() {
        return den;
    }

    public void setNume(String den) {
        this.den = den;
    }

    public int getNrjuc() {
        return nrjuc;
    }

    public void setNrjuc(int nrjuc) {
        this.nrjuc = nrjuc;
    }

    public int getLiga() {
        return liga;
    }

    public void setLiga(int liga) {
        this.liga = liga;
    }
}
