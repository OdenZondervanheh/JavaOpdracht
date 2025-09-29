package com.mycompany.h5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef0512 {
    private String Regels;
    private Text Teksten, titel;
    private Double Getallen, rGetallen;

    public Oden_Zondervan_Oef0512(GridPane p) {

    }



    static void main(String[] args) {
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