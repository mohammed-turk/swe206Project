package com.example.swe206project;

import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {
     static ArrayList<Student> allStudents = new ArrayList<>();
     static ArrayList<Tournament> allTournaments = new ArrayList<>();
     static ArrayList<SportOrGame> allSportsAndGames = new ArrayList<>();
     static int c;



    public static void setAllSportsAndGames(ArrayList<SportOrGame> allSportsAndGames) {
        DataBase.allSportsAndGames = allSportsAndGames;
    }

    public static void setC(int c) {
        DataBase.c = c;
    }
}
