package com.mycompany.h5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef0512 {
    private Text Tekst, Resultaat;
    private final TextField Tekstvak;
    private int Getallen, rGetallen, Getal;

    public Oden_Zondervan_Oef0512(GridPane p) {
        Tekstvak = new TextField();
        Tekst = new Text("Romeinse cijfers");
        Resultaat = new Text("Resultaat: ");

        Tekstvak.setOnAction(event -> {
            Getal = Integer.parseInt(Tekstvak.getText());
            if (Getal <= 0 || Getal > 2100) {
                Resultaat.setText("Dit is fout!!");
            } else {
                int[] Getallen = {1000 ,900 ,500 ,400 ,100 ,90 ,50 ,40 ,10 ,9 ,5 ,4 ,1 };
                String[] rGetallen = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                StringBuilder Resultaten = new StringBuilder();

                for(int i = 0; i < Getallen.length; i++){
                    while(Getal >= Getallen[i]){
                        Getal -= Getallen[i];
                        Resultaten.append(rGetallen[i]);
                    }
                }
                Resultaat.setText(Resultaten.toString());
            }
        });

        p.add(Tekstvak, 2, 0);
        p.add(Tekst, 1, 0);
        p.add(Resultaat,2,2);
    }


    public static void main(String[] args) {
        Oden_Zondervan_Oef0512.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef0512(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}