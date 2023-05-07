package com.example.swe206project;

import java.util.ArrayList;
// extends Participant is removed
public class Student {
    protected String studentEmail;
    protected int id;
    protected String name;
    protected ArrayList<RoundRobin> roundRobins;
    protected ArrayList<Elimination> eliminations;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void registerTournament(Tournament tournament){

    }
    public void updateTournamentProfile(Tournament tournament){

    }
    @Override
    public String toString(){

        return String.valueOf(id);
    }
}
