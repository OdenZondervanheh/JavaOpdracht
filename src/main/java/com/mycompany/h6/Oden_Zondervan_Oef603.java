package com.mycompany.h6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;

public class Oden_Zondervan_Oef603 {

    private Button uurButton, minuutButton, secondenButton;
    private Text urentext, minutentext, secondentext;
    private Tijdstip tijd;


    public Oden_Zondervan_Oef603(GridPane p) {

        urentext = new Text("");
        minutentext = new Text("");
        secondentext = new Text("");

        uurButton = new Button("Uur");
        minuutButton = new Button("Minuut");
        secondenButton = new Button("Seconden");

        tijd = new Tijdstip();

        uurButton.setOnAction(event ->{
            tijd.setUren(7);

            urentext.setText("" + tijd.getUren());
        });

        minuutButton.setOnAction(event ->{
            tijd.setMinuten(9);
            minutentext.setText("" + tijd.getMinuten());
        });

        secondenButton.setOnAction(event ->{
            tijd.setSeconden(10);
            secondentext.setText("" + tijd.getSeconden());
        });



        p.add(urentext,2,0);
        p.add(minutentext,2,1);
        p.add(secondentext,2,2);

        p.add(uurButton,0,0);
        p.add(minuutButton,0,1);
        p.add(secondenButton,0,2);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef603.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef603(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }

    class Tijdstip {
        private int uren;
        private int minuten;
        private int seconden;


        public int getUren() {
            return uren;
        }

        public int getMinuten() {
            return minuten;
        }

        public int getSeconden() {
            return seconden;
        }

        public void setUren(int uren) {
            this.uren = uren;
        }

        public void setMinuten(int minuten) {
            this.minuten = minuten;
        }

        public void setSeconden(int seconden) {
            this.seconden = seconden;
        }
    }
}
