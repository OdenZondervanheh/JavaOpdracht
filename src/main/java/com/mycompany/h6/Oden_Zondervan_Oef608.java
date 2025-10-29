package com.mycompany.h6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef608 {
//    labuubuuuuu

    private Leerling lid1,lid2;
    private Team team;

    private ComboBox<String> dropDown;
    private Button naamButton, klasButton, geslachtButton, nummerButton, teamButton;
    private TextField naamInput, klasInput, geslachtInput, nummerInput;
    private Text naamText, klasText, geslachtText, nummerText, teamText, lid1Text, lid2Text;

        public Oden_Zondervan_Oef608(GridPane p){
            naamText = new Text();
            klasText = new Text();
            geslachtText = new Text();
            nummerText = new Text();
            teamText = new Text();
            lid1Text = new Text();
            lid2Text = new Text();

            naamInput = new TextField();
            klasInput = new TextField();
            geslachtInput = new TextField();
            nummerInput = new TextField();

            naamButton = new Button("Add Naam");
            klasButton = new Button("Add Klas");
            geslachtButton = new Button("Add Geslacht");
            nummerButton = new Button("Add Nummer");
            teamButton = new Button("Add Team");

            lid1 = new Leerling();
            lid2 = new Leerling();
            team = new Team();

            dropDown = new ComboBox<String>();

            dropDown.getItems().addAll("lid1", "lid2");
            dropDown.setValue("lid1");

            naamButton.setOnAction(event ->{
                String invoervak = naamInput.getText();


                if (dropDown.getValue().equals("lid1")){
                    lid1.setNaam(invoervak);
                    lid1Text.setText(lid1.toString());
                } else if(dropDown.getValue().equals("lid2")){
                    lid2.setNaam(invoervak);
                    lid2Text.setText(lid2.toString());
                }
            });

            klasButton.setOnAction(event ->{
                String invoervak = klasInput.getText();

                if (dropDown.getValue().equals("lid1")){
                    lid1.setKlas(invoervak);
                    lid1Text.setText(lid1.toString());
                } else if (dropDown.getValue().equals("lid2")){
                    lid2.setKlas(invoervak);
                    lid2Text.setText(lid2.toString());
                }
            });

            geslachtButton.setOnAction(event ->{
                String invoervak = geslachtInput.getText();

                if (dropDown.getValue().equals("lid1")){
                    lid1.setGeslacht(invoervak);
                    lid1Text.setText(lid1.toString());
                } else if (dropDown.getValue().equals("lid2")){
                    lid2.setGeslacht(invoervak);
                    lid2Text.setText(lid2.toString());
                }
            });

            nummerButton.setOnAction(event ->{
                int invoervak = Integer.parseInt(nummerInput.getText());

                if (dropDown.getValue().equals("lid1")){
                    lid1.setNummer(invoervak);
                    lid1Text.setText("" + lid1.toString());
                } else if(dropDown.getValue().equals("lid2")){
                    lid2.setNummer(invoervak);
                    lid2Text.setText("" + lid2.toString());
                }
            });

            teamButton.setOnAction(event ->{
                team.setLid1(lid1);
                team.setLid2(lid2);
                teamText.setText(team.toString());
            });

            p.add(naamInput,0,0);
            p.add(klasInput,0,1);
            p.add(geslachtInput,0,2);
            p.add(nummerInput,0,3);

            p.add(naamButton,1,0);
            p.add(klasButton,1,1);
            p.add(geslachtButton,1,2);
            p.add(nummerButton,1,3);
            p.add(teamButton,1,4);
            p.add(dropDown,0,4);

            p.add(naamText,1,5);
            p.add(klasText,2,5);
            p.add(geslachtText,3,5);
            p.add(nummerText,4,5);
            p.add(teamText,5,5);
            p.add(lid1Text,6,6);
            p.add(lid2Text,6,7);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef608.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef608(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }

    class Leerling{
        private String naam, klas, geslacht;
        private int nummer;

        public int getNummer(){return nummer;}

        public String getNaam(){return naam;}

        public String getKlas(){return klas;}

        public String getGeslacht(){return geslacht;}

        public void setNaam(String naam){this.naam = naam;}

        public void setKlas(String klas) {this.klas = klas;}

        public void setGeslacht(String geslacht) {this.geslacht = geslacht;}

        public void setNummer(int nummer) { this.nummer = nummer;}

        @Override
        public String toString() {
            return String.format("Naam: %s en Klas: %s en Geslacht: %s en Nummer: %s LOL", naam, klas, geslacht, nummer);
        }
    }

    class Team{
        private Leerling lid1, lid2;

        public Leerling getLid1(){return lid1;}

        public Leerling getLid2() {return lid2;}

        public void setLid1(Leerling lid1) {this.lid1 = lid1;}

        public void setLid2(Leerling lid2) {this.lid2 = lid2;}

        @Override
        public String toString() {
            return String.format( "halootjes %s en %s", lid1.getNaam(), lid2.getNaam());

        }
    }
}

