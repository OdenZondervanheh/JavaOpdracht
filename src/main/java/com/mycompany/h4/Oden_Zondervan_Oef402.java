package com.mycompany.h4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class Oden_Zondervan_Oef402 {
    private final TextField invoervak1, invoervak2, uitvoer;
    private final Button gemiddeld, schoonmaak;
    private final Label invoertext1, invoertext2, resultaattext;

    public Oden_Zondervan_Oef402(GridPane p){

        invoervak1 = new TextField();
        invoervak2 = new TextField();
        uitvoer = new TextField();

        invoertext1 = new Label("Eerste getal invoer");
        invoertext2 = new Label("Tweede getal invoer");
        resultaattext = new Label("Resultaat");

        gemiddeld = new Button( "Bereken" );
        schoonmaak = new Button( "C" );

        p.add(invoervak1, 1, 0);
        p.add(invoervak2, 1, 1);
        p.add(uitvoer, 1, 3);
        p.add(schoonmaak, 2, 2);
        p.add(gemiddeld,1 , 2);

        p.add(invoertext1, 0, 0);
        p.add(invoertext2, 0, 1);
        p.add(resultaattext, 0, 3);


        gemiddeld.setOnAction( event -> {
            String invoer1 = invoervak1.getText();
            double getal1 = Double.parseDouble(invoer1);
            String invoer2 = invoervak2.getText();
            double getal2 = Double.parseDouble(invoer2);

            double resultaat2 = (getal1 + getal2) / 2;
            uitvoer.setText(""+resultaat2);

        });

        schoonmaak.setOnAction( event -> {
            invoervak1.clear();
            invoervak2.clear();
            uitvoer.clear();
            uitvoer.clear();
        });

    }

    // Toegevoegd voor convenience (anders moet je {naam}$launcher doen voor run)
    public static void main(String[] args) {
        Oden_Zondervan_Oef402.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef402(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
