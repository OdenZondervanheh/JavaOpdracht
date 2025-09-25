package com.mycompany.h4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Math;

public class Oden_Zondervan_Oef406 {

    private Text resultaatText, newText;
    private doubelsteentje dobbelsteen, dobbelsteen2;
    private int resultaat, resultaat2;
    private Button random, telZessenButton;
    private TextField dobbelvakje;


    public Oden_Zondervan_Oef406(GridPane p) {
        resultaatText = new Text();
        newText = new Text();
        random = new Button("Random");
        telZessenButton = new Button("Aantal worpen");
        dobbelsteen = new doubelsteentje();
        dobbelsteen2 = new doubelsteentje();
        dobbelvakje = new TextField();

        resultaat = dobbelsteen.gooi();
        resultaat2 = dobbelsteen2.gooi();

        resultaatText.setText("" + resultaat + " en " + resultaat2);
        resultaatText.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        newText.setFont(Font.font("Arial", FontWeight.BOLD, 36));

        p.add(resultaatText, 3, 1);
        p.add(random, 4, 1);
        p.add(dobbelvakje,3,3);
        p.add(telZessenButton,4, 3);
        p.add(newText, 3, 2);

        telZessenButton.setOnAction(event ->{
            String invoer = dobbelvakje.getText();
            int invoerGetal = Integer.parseInt(invoer);

            int vakje = dobbelsteen.telZessen(invoerGetal);
            newText.setText("Je hebt zoveel keer 6 gegooid " + vakje);
        });

        random.setOnAction(event -> {
            resultaat = dobbelsteen.gooi();
            resultaat2 = dobbelsteen2.gooi();

            resultaatText.setText(" " + resultaat + " en " + resultaat2);
        });
    }

    public class doubelsteentje {
        public int gooi() {
            double resultaat = Math.random();
            resultaat *= 6;
            resultaat += 1;
            return (int) resultaat;
        }

        public int telZessen(int aantalWorpen) {
            int optellen = 0;
            for (int i = 1; i <= aantalWorpen; i++) {
                int resultaat = gooi();
                if (resultaat == 6) {
                    optellen += 1;
                }

            }
            return optellen;
        }
    }


    public static void main(String[] args) {
        Oden_Zondervan_Oef406.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef406(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
