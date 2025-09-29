package com.mycompany.h5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef0513 {
    private Text resultaattext, text, titel;
    private String regels;
    private int getal, voriggetal, huidiggetal ;


    public Oden_Zondervan_Oef0513(GridPane p){
        resultaattext = new Text("");
        text = new Text("");
        titel = new Text("");
        getal = 1;
        voriggetal = 0;
        huidiggetal = 1;

        regels = String.format("%2d", 1);
        text = new Text(regels);
        text.setFont(Font.font("Monospaced", 12));
        p.add(text,0,0);

        for(int i = 1; i<= 15; i++){
            int getal = voriggetal + huidiggetal;
            voriggetal = huidiggetal;
            huidiggetal = getal;
            regels = String.format("%2d", getal);
            text = new Text(regels);
            text.setFont(Font.font("Monospaced", 12));
            p.add(text,0,i);
        }

        p.setVgap(5);
        p.setPadding(new Insets(20,50,30,50));
        p.setAlignment(Pos.CENTER);
    }


    public static void main(String[] args) {
        Oden_Zondervan_Oef0513.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef0513(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}

