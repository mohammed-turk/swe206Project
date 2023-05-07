package com.example.swe206project;

public class fun {
    public static void main(String[] args) {
        System.out.println(DataBase.allStudents);

        DataBase.allSportsAndGames.add(new SportOrGame("Football",false,true,11));
        DataBase.allSportsAndGames.add(new SportOrGame("Volleyball",false,true,6));
        DataBase.allSportsAndGames.add(new SportOrGame("Basketball",false,true,5));
        DataBase.allSportsAndGames.add(new SportOrGame("Tennis",true,false,1));

        System.out.println(DataBase.c);
    }
}
