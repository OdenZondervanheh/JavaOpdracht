package com.mycompany.h6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef606 {

    private Button uurButton, minuutButton, secondenButton;
    private Text urentext, minutentext, secondentext, tijdValue;
    private Tijdstip tijd;
    private TextField invoerveld;


    public Oden_Zondervan_Oef606(GridPane p) {
        urentext = new Text("");
        minutentext = new Text("");
        secondentext = new Text("");
        tijdValue = new Text("");

        uurButton = new Button("Uur");
        minuutButton = new Button("Minuut");
        secondenButton = new Button("Seconden");
        invoerveld = new TextField("");

        tijd = new Oden_Zondervan_Oef606.Tijdstip();

        uurButton.setOnAction(event ->{
            String invoervak = (invoerveld.getText());
            int aantalUren = Integer.parseInt(invoervak);

            tijd.setUren(aantalUren);
            urentext.setText("" + tijd.getUren());
            tijdValue.setText(tijd.toString());
        });

        minuutButton.setOnAction(event ->{
            String invoervak = (invoerveld.getText());
            int aantalMinuten = Integer.parseInt(invoervak);

            tijd.setMinuten(aantalMinuten);
            minutentext.setText("" + tijd.getMinuten());
            tijdValue.setText(tijd.toString());
        });

        secondenButton.setOnAction(event ->{
            String invoervak = (invoerveld.getText());
            int aantalSeconden = Integer.parseInt(invoervak);

            tijd.setSeconden(aantalSeconden);
            secondentext.setText("" + tijd.getSeconden());
            tijdValue.setText(tijd.toString());
        });



        p.add(urentext,2,0);
        p.add(minutentext,2,1);
        p.add(secondentext,2,2);

        p.add(uurButton,0,0);
        p.add(minuutButton,0,1);
        p.add(secondenButton,0,2);
        p.add(invoerveld,0,3);
        p.add(tijdValue,5,5);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef606.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef606(root);

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
            this.uren += uren;
        }

        public void setMinuten(int minuten) {
            this.minuten += minuten;
        }

        public void setSeconden(int seconden) {
            this.seconden += seconden;
        }

        @Override
        public String toString(){
            uren = getUren() %24;
            minuten = getMinuten() %60;
            seconden = getSeconden() %60;
            return String.format("Uren: %02d Minuten: %02d Seconden: %02d", uren , minuten, seconden);
        }
    }
}
