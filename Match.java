package com.example.swe206project;

public class Match {
    private Participant participant1;
    private  Participant participant2;

    Match(Participant participant1, Participant participant2){
        this.participant1 = participant1;
        this.participant2 = participant2;
    }
    private int participant1Result;
    private int participant2Result;

    public void setParticipant1Result(int participant1Result) {
        this.participant1Result = participant1Result;
    }

    public void setParticipant2(Participant participant2) {
        this.participant2 = participant2;
    }

    public void updateProfileRecord(String winner, String loser){

    }
    public void updateProfileRecord(String draws){

    }
}
