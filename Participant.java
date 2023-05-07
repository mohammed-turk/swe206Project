package com.example.swe206project;

public class Participant {
    protected Student student;
    protected String name;
    protected int draws = 0;
    protected int loses = 0;
    protected int points =0;
    protected int wins =0;
    Participant(String name, Student student){
        this.name = name;
        this.student = student;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLoses() {
        return loses;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }
}

