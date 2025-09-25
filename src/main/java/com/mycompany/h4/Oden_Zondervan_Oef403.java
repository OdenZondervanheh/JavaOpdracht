package com.mycompany.h4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.math.BigInteger;

public class Oden_Zondervan_Oef403 {
    private int jaartal;
    private double populatieincrease;
    private long populatie;
    private final Text jaartaltext, popultatietext;
    private final Button jaaromhoog;

    public Oden_Zondervan_Oef403(GridPane p) {
        jaartal = 1960;
        populatie = 3_000_000_000L;

        jaartaltext = new Text("" + jaartal);
        popultatietext = new Text("" + populatie);
        jaaromhoog = new Button("Number go up");

        jaaromhoog.setOnAction(actionEvent -> {
            jaartal += 1;
            populatieincrease = populatie * 0.0165;
            populatie += (long) populatieincrease;

            jaartaltext.setText("" + jaartal);
            popultatietext.setText("" + populatie);
        });

        p.add(jaartaltext,0,0);
        p.add(popultatietext,0,1);
        p.add(jaaromhoog,0,2);

        jaartaltext.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        popultatietext.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    }

    // Toegevoegd voor convenience (anders moet je {naam}$launcher doen voor run)
    public static void main(String[] args) {
        Oden_Zondervan_Oef403.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef403(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
