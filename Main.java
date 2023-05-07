package com.example.swe206project;

import javafx.application.Application;
import javafx.beans.value.ObservableStringValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main extends Application {
    protected Scene scene3;
//    protected ArrayList<Student> allStudents= new ArrayList<>();
//    protected ArrayList<Tournament> allTournaments = new ArrayList<>();
    public void start(Stage stage) throws IOException, ClassNotFoundException {
        DataBase.allSportsAndGames.add(new SportOrGame("Football",false,true,11));
        DataBase.setAllSportsAndGames(DataBase.allSportsAndGames);

        DataBase.allStudents.add(new Student("Mohammed",123456781));
        DataBase.allStudents.add(new Student("Turki",123456782));
        DataBase.allStudents.add(new Student("Ali",123456783));
        DataBase.allStudents.add(new Student("Yasser",123456784));
        DataBase.allStudents.add(new Student("Saif",123456785));
        DataBase.allStudents.add(new Student("Maher",123456786));
        DataBase.allStudents.add(new Student("Sajjad",123456787));
        DataBase.allStudents.add(new Student("Yahya",123456788));
        DataBase.allStudents.add(new Student("sameer",183456789));
        DataBase.allStudents.add(new Student("Sade",123456780));
        DataBase.allStudents.add(new Student("Nor",123456719));
        DataBase.allStudents.add(new Student("Bahar",123456729));
        DataBase.allStudents.add(new Student("Jabel",123456739));
        DataBase.allStudents.add(new Student("Saleh",123456749));
        DataBase.allStudents.add(new Student("Suhail",123456759));
        DataBase.allStudents.add(new Student("Hamza",123456769));
        DataBase.allStudents.add(new Student("Noh",123456779));
        DataBase.allStudents.add(new Student("Hod",126456789));
        DataBase.allStudents.add(new Student("Ibrahim",123456799));
        DataBase.allStudents.add(new Student("Essa",123456709));
        DataBase.allStudents.add(new Student("Lot",123456089));
        DataBase.allStudents.add(new Student("Najib",123456189));
        DataBase.allStudents.add(new Student("Samah",123456289));
        DataBase.allStudents.add(new Student("Majed",123456389));
        DataBase.allStudents.add(new Student("Maher",123456489));
        DataBase.allStudents.add(new Student("Mustafa",123456589));
        DataBase.allStudents.add(new Student("Abdullah",123456689));
        DataBase.allStudents.add(new Student("Hammed",443456789));
        DataBase.allStudents.add(new Student("Reda",123456889));
        DataBase.allStudents.add(new Student("Elias",123456989));
        DataBase.allStudents.add(new Student("Kian",123450789));
        DataBase.allStudents.add(new Student("Danial",123451789));
        DataBase.allStudents.add(new Student("Mortada",123452789));
        DataBase.allStudents.add(new Student("Rabih",123453789));
        DataBase.allStudents.add(new Student("Bassam",123454789));
        DataBase.allStudents.add(new Student("Mohammed",123455789));
        DataBase.allStudents.add(new Student("Mohammed",133456789));
        DataBase.allStudents.add(new Student("Abdullah",123457789));
        DataBase.allStudents.add(new Student("Abdullah",123458789));
        DataBase.allStudents.add(new Student("Saher",123459789));
        DataBase.allStudents.add(new Student("Ganem",123406789));
        DataBase.allStudents.add(new Student("Sultan",123416789));
        DataBase.allStudents.add(new Student("Abdulrahman",123426789));
        DataBase.allStudents.add(new Student("Jawad",123436789));


        System.out.println(DataBase.allStudents);
//        ArrayList<SportOrGame> allSportsAndGames= new ArrayList<>();
        DataBase.allSportsAndGames.add(new SportOrGame("Football",false,true,11));
        DataBase.allSportsAndGames.add(new SportOrGame("Volleyball",false,true,6));
        DataBase.allSportsAndGames.add(new SportOrGame("Basketball",false,true,5));
        DataBase.allSportsAndGames.add(new SportOrGame("Tennis",true,false,1));

        BorderPane borderPane = new BorderPane();

        Button admin = new Button("Admin");

        Button student = new Button("Student");

        System.out.println(Arrays.toString(DataBase.allTournaments.toArray()));
        HBox hBox = new HBox();
        hBox.setSpacing(50);
        hBox.setPadding(new Insets(350, 0, 0, 225));
        hBox.getChildren().add(admin);
        hBox.getChildren().add(student);

        borderPane.setCenter(hBox);
        Scene scene = new Scene(borderPane, 600, 700);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();

        admin.setOnAction(e -> {
            BorderPane borderPane1 = new BorderPane();
            Button Tournament = new Button("create Tournament");

            HBox adminMethods = new HBox();
            adminMethods.setSpacing(30);
            adminMethods.setPadding(new Insets(350, 10, 10, 10));

            Button createTournament = new Button("createTournament");
            Button modifyTournament = new Button("modifyTournament");
            Button viewTournament = new Button("viewTournament");
            Button StudentsProfiles = new Button("StudentsProfiles");
            adminMethods.getChildren().addAll(createTournament,modifyTournament,viewTournament, StudentsProfiles);
            borderPane1.setCenter(adminMethods);


            Scene scene1 = new Scene(borderPane1, 600, 700);
            stage.setTitle("Admin");
            stage.setScene(scene1);
            stage.show();

            createTournament.setOnAction(b ->{
                BorderPane borderPane2 = new BorderPane();

                VBox tournamentInfo = new VBox();
                tournamentInfo.setPadding(new Insets(100,10,10,10));
                tournamentInfo.setSpacing(30);

                Label guide = new Label("                                                                Fill the tournament information");

                TextField name = new TextField();
                name.setPromptText("Enter the tournament name");
                TextField eliminationOrRoundRobin = new TextField();
                eliminationOrRoundRobin.setPromptText("Enter the Tournament type (elimination) or (round robin)");

                TextField gameOrSport = new TextField();
                gameOrSport.setPromptText("Enter one sport from these"+ Arrays.toString(DataBase.allSportsAndGames.toArray()));
                tournamentInfo.getChildren().add(guide);
                tournamentInfo.getChildren().addAll(name, eliminationOrRoundRobin, gameOrSport );
                borderPane2.setCenter(tournamentInfo);
                HBox hBox1 = new HBox();

                Button done = new Button("add players");

                Button addSport = new Button("choose and add new sport");
                hBox1.getChildren().addAll(done, addSport);
                hBox1.setSpacing(30);
                hBox1.setAlignment(Pos.CENTER);
                borderPane2.setBottom(hBox1);
                Scene scene2 = new Scene(borderPane2, 600, 700);
                stage.setTitle("createTournament");
                stage.setScene(scene2);
                stage.show();

                done.setOnAction(a -> {
                    BorderPane borderPane3 = new BorderPane();

                    int location =0;
                    for(int i =0; i< DataBase.allSportsAndGames.size(); i++){
                        if (DataBase.allSportsAndGames.get(i).equals(gameOrSport.getText()))
                            location =i;
                    }
                    DataBase.allTournaments.add(new Tournament(name.getText(),DataBase.allSportsAndGames.get(location)));
                    System.out.println(11);

                    if (eliminationOrRoundRobin.getText().equals("elimination")){

                    }
                    else if (eliminationOrRoundRobin.getText().equals("round robin")){
                        if (DataBase.allSportsAndGames.get(location).acceptTeamPlayers){
                            VBox vBox = new VBox();
                            Label guide3 =  new Label("                                                                fill the team information");
                            ArrayList<TextField> textField = new ArrayList<>();

                            vBox.getChildren().add(guide3);
                            TextField textField1 = new TextField();
                            textField1.setPromptText("Enter the Team name");
                            vBox.getChildren().add(textField1);

                            textField.add(new TextField("leader"));
                            textField.get(0).setPromptText("Enter the leader id");
                            vBox.getChildren().add(textField.get(0));
                            for (int i =1; i<DataBase.allSportsAndGames.get(location).teamMembersNumber; i++){
                                String s = String.valueOf(i);
                                textField.add(new TextField(s));
                                textField.get(i).setPromptText("Enter the id of student"+(i+1));
                                vBox.getChildren().add(textField.get(i));
                            }
                            int theLeader;
                            borderPane3.setCenter(vBox);
//                            for(int i =0; i<allStudents.size(); i++){
//                                if (allStudents.get(i).toString().equals(textField1.getText())){
//                                    theLeader = i;
//                                }
//                            }
                            ArrayList<String> ids= new ArrayList<>();
                            ArrayList<Student> students= new ArrayList<>();

                            for(int k=0;k<textField.size();k++){
                                ids.add(textField.get(k).getText());
                            }
                            for(int j =0; j<ids.size(); j++){
                                for(int i =0; i<DataBase.allStudents.size(); i++){
                                    if(ids.get(j).equals(DataBase.allStudents.get(i)))
                                        students.add(DataBase.allStudents.get(i));
                                }
                            }
                            Button addTheTeam = new Button("save team");

                            HBox hBox2 = new HBox();





                            Label label = new Label("if you want to add another team just rewrite the data in the text fields to sout the new team information and save it again");
                            hBox2.getChildren().add(label);
                            hBox2.getChildren().add(addTheTeam);
                            hBox2.setSpacing(30);

                            borderPane3.setBottom(hBox2);
                            addTheTeam.setOnAction(l ->{
                                DataBase.allTournaments.get(DataBase.allTournaments.size()-1).teams.add(new Team(textField1.getText(),students.get(0),students) );
                            });


//                            allTournaments.get(allTournaments.size()-1).teams.add();
                        }
                        else {
//                            allTournaments.get(allTournaments.size()-1).participants.add();
                        }

                    }
                     scene3 = new Scene(borderPane3, 600, 700);
                    stage.setTitle("add players");
                    stage.setScene(scene3);
                    stage.show();
                });
                addSport.setOnAction(d-> {
                    BorderPane borderPane4 = new BorderPane();
                    VBox sportInfo = new VBox();
                    sportInfo.setPadding(new Insets(100,10,10,10));
                    sportInfo.setSpacing(30);

                    Label guide2 = new Label("                                                                Fill the sport information");
                    TextField name2 = new TextField();
                    name2.setPromptText("Enter the sport name");
                    TextField acceptIndividualPlayersOrTeams = new TextField();
                    acceptIndividualPlayersOrTeams.setPromptText("Enter (individual) for individual players sport or (team) for teams players ");
                    TextField teamMembers = new TextField();
                    teamMembers.setPromptText("Enter the number of participant on each team(if it is individual enter 1) ");
                    sportInfo.getChildren().add(guide2);
                    sportInfo.getChildren().addAll(name2, teamMembers );
                    borderPane4.setCenter(sportInfo);
                    Button done2 = new Button("complete the tournament information");

                    Scene scene4 = new Scene(borderPane4, 600, 700);
                    stage.setTitle("add new sport");
                    stage.setScene(scene4);
                    stage.show();

                    done2.setOnAction(f -> {
                        boolean indiv = false;
                        boolean team =false;
                        if (acceptIndividualPlayersOrTeams.getText().equals("individual")){
                            indiv = true;

                        }
                        else if (acceptIndividualPlayersOrTeams.getText().equals("team")){
                            team = true;
                            Button buttonn = new Button("add players");
                            buttonn.setOnAction(i ->{
                                stage.setTitle("add players");
                                stage.setScene(scene3);
                                stage.show();
                            });
                        }
                        DataBase.allSportsAndGames.add(new SportOrGame(name2.getText(),indiv,team,Integer.parseInt(teamMembers.getText())));
                    });


                }
                );

            });
        });
        System.out.println(Arrays.toString(DataBase.allTournaments.toArray())); }






    public static void main(String[] args) {
        launch();

    }
}
