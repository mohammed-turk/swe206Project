package com.example.swe206project;

import java.util.ArrayList;

public class Admin {
    protected String email;
    protected int id;
    protected String name;
    protected ArrayList<RoundRobin> roundRobins;
    protected ArrayList<Elimination> eliminations;

    Admin(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
    }



    public void addSportOrGame(String name){

    }
    public Elimination createElimination(){
//        remember to delete the defult constructor that the sys create in elimination

        return new Elimination();

    }
    public RoundRobin createRoundRobin(){
//        123
//        remember to delete the defult constructor that the sys create in roundrobin
        return new RoundRobin();
    }
    public void modifyTournament(Tournament tournament){

    }
    public void registerParticipant(Tournament tournament){

    }
    public void removeParticipant(Tournament tournament){

    }

}
