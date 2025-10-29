package com.mycompany.h6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Oden_Zondervan_Oef607 {
        private Text naamText, gewichtText;
        private  Persoon persoon;
        private TextField invoerVak;
        private Button naamButton, gewichtButton;

    public  Oden_Zondervan_Oef607(GridPane p){
        naamText = new Text("");
        gewichtText = new Text("");
        persoon = new Persoon();
        naamButton = new Button("Naam!");
        gewichtButton = new Button("Gewicht!");

        invoerVak = new TextField("");

        naamButton.setOnAction(event ->{
            String invoer = (invoerVak.getText());
            persoon.setNaam(invoer);
            naamText.setText(persoon.getNaam());
        });

        gewichtButton.setOnAction(event ->{
            String invoer = (invoerVak.getText());
            int aantalGewicht = Integer.parseInt(invoer);

            persoon.setGewicht(aantalGewicht);
            gewichtText.setText("" + persoon.Getgewicht());
        });

        p.add(naamText,6,6);
        p.add(gewichtText,5,5);
        p.add(invoerVak,2,0);
        p.add(naamButton,2,1);
        p.add(gewichtButton,2,2);

    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef607.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef607(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
        }
    }

