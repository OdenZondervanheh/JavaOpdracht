package com.mycompany.h5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef055 {
//    private final TextField tekstfield;
    private String regel;
    private  Text tekst, titel;
    private Double getalletje;

    Oden_Zondervan_Oef055(GridPane p){
        regel = "De tafel van 13";
        tekst = new Text();
        titel = new Text(regel);
        titel.setFont(Font.font("Monospaced", 14));
        p.add(titel, 0,0);
        getalletje = 10.00;

        for( int i = 1; i <= 8; i++) {
            getalletje += 0.25;
            regel = String.format("%2d %3s", i, getalletje);
            tekst = new Text(regel);
            tekst.setFont(Font.font("Monospaced", 12));
            p.add(tekst,0,i);

            p.setVgap(5);
            p.setPadding(new Insets(20,50,30,50));
            p.setAlignment(Pos.CENTER);
        }
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef055.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef055(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
