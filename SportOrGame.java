package com.example.swe206project;

public class SportOrGame {
    protected String name;
    protected boolean acceptIndividualPlayers;
    protected boolean acceptTeamPlayers;
    protected int teamMembersNumber;
   protected boolean acceptWithdraw;

    SportOrGame(String name, boolean acceptIndividualPlayers,boolean acceptTeamPlayers, int teamMembersNumber){
        this.name = name;
        this.acceptIndividualPlayers = acceptIndividualPlayers;
        this.acceptTeamPlayers = acceptTeamPlayers;

        this.teamMembersNumber = teamMembersNumber;
    }

    @Override
    public String toString(){

        return name;
    }
}
