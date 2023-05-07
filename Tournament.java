package com.example.swe206project;

import java.util.ArrayList;
import java.util.Date;

public class Tournament {
    protected SportOrGame gameOrSport;
    protected ArrayList<Participant> participants;
    protected ArrayList<Team> teams;
//    protected int participantCapacity;
    protected String name;
//    protected int period;
    protected Date startRegistration;
    protected  Date endRegistration;

//    Participant[] participants,
    public Tournament(String name,  SportOrGame gameOrSport ){
        this.gameOrSport =gameOrSport;
        this.name = name;
//        this.period = period;
//        this.participantCapacity = participantCapacity;
//        this.participants = participants;
    }
//    public Tournament(String name, Team[] teams, SportOrGame gameOrSport ){
//        this.gameOrSport =gameOrSport;
//        this.name = name;
////        this.period = period;
////        this.participantCapacity = participantCapacity;
//        this.teams = teams;
//    }



    //    common in both
    public void endRegistration(Date date){

    }

    public void searchByDate(Date date){

    }
    public void sendEmail(Participant participant){

    }
    public void startRegistration(Date date){

    }


//    round rubin methods
    public void modifyRound(){

    }
    public Match[] roundMatch(Participant[] participants){
//        delete the return
        return new Match[10];

    }
    public Match[] roundMatch(Team[] participants){
//        delete the return
        return new Match[10];

    }
    /// we should implement comparaple instead
    public void sortRanking(Participant[] participants){

    }
    public void  viewRoundTournament(){

    }


//    elimination methods
    public Match[] eliminationMatches(Participant[] participants){
//        delete the return
        return new Match[1  ];
    }
    public Match[] eliminationMatches(Team[] teams){
//        delete the return
        return new Match[1  ];
    }
    public void modifyElimination(){

    }
    public void viewEliminationTournament(){

    }

}
