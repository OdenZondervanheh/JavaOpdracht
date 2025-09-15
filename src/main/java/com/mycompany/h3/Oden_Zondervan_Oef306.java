package com.mycompany.h3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;

public class Oden_Zondervan_Oef306 {
    private final Button plusknop, keerknop, clearknop, deelknop, modulesknop;
    private final TextField invoervak1, invoervak2, resultaatvak;

    public Oden_Zondervan_Oef306(Pane p) {
        plusknop = new Button( "+" );
        keerknop = new Button( "x" );
        deelknop = new Button( "/" );
        modulesknop = new Button( "%" );
        clearknop =  new Button("C");

        invoervak1 = new TextField();
        invoervak2 = new TextField();
        resultaatvak = new TextField();

        invoervak1.relocate(20, 20);
        invoervak2.relocate(20, 50);
        plusknop.relocate(20, 80);
        keerknop.relocate(50, 80);
        deelknop.relocate(80, 80);
        modulesknop.relocate(110, 80);
        clearknop.relocate(140, 80);
        resultaatvak.relocate(20, 110);

        invoervak1.setAlignment(Pos.CENTER_RIGHT);
        invoervak2.setAlignment(Pos.CENTER_RIGHT);
        resultaatvak.setAlignment(Pos.CENTER_RIGHT);

        plusknop.setOnAction( event -> {
            String invoer1 = invoervak1.getText();
            int getal1 = Integer.parseInt(invoer1);
            String invoer2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoer2);

            int resultaat = getal1 + getal2;
            resultaatvak .setText(""+resultaat);
        });

        keerknop.setOnAction( event -> {
            String invoer1 = invoervak1.getText();
            int getal1 = Integer.parseInt(invoer1);
            String invoer2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoer2);

            int resultaat = getal1 * getal2;
            resultaatvak .setText(""+resultaat);
        });

        deelknop.setOnAction( event -> {
            String invoer1 = invoervak1.getText();
            int getal1 = Integer.parseInt(invoer1);
            String invoer2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoer2);

            int resultaat = getal1 / getal2;
            resultaatvak .setText(""+resultaat);

        });

        modulesknop.setOnAction( event -> {
            String invoer1 = invoervak1.getText();
            int getal1 = Integer.parseInt(invoer1);
            String invoer2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoer2);

            int resultaat = getal1 / getal2;
            int resultaat2 = getal1 % getal2;
            resultaatvak.setText(resultaat + " Met zoveel over "+resultaat2);

        });

        clearknop.setOnAction( event -> {
            invoervak1.clear();
            invoervak2.clear();
            resultaatvak.clear();
        });

        //Pane p componenten
        p.getChildren(). addAll( invoervak1, invoervak2,
                plusknop, keerknop, clearknop, deelknop, modulesknop, resultaatvak);
    }



    // Toegevoegd voor convenience (anders moet je {naam}$launcher doen voor run)
    public static void main(String[] args) {
        Oden_Zondervan_Oef306.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef306(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}


