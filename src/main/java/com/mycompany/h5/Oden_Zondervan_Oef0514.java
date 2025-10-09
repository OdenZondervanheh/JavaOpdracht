package com.mycompany.h5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Oden_Zondervan_Oef0514 {
    private final Label Uitlegtext;
    private final TextField invoer;
    private final Button clearButton;

    public Oden_Zondervan_Oef0514(GridPane p){
        Uitlegtext = new Label("Hoeveel treden wens je? ");
        invoer  = new TextField();
        clearButton = new Button("Clear");

        invoer.setOnAction(event ->{
            String invoerVak = invoer.getText();
            int aantal = Integer.parseInt(invoerVak);

            for(int i = 0; i <= aantal * 2; i++){
                if(i % 2 == 0){
                    Line newLine = new Line(10f,10,30f,10f);
                    newLine.setStroke(Color.RED);
                    p.add(newLine, i + 2, i + 2);

                } else {
                    Line newLine = new Line(10f,10f,10f,30f);
                    newLine.setStroke(Color.BLUE);
                    p.add(newLine, i + 2, i + 2);

                }
            }
        });
        p.add(Uitlegtext,0,0);
        p.add(invoer,1,0);
        p.setAlignment(Pos.TOP_CENTER);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef0514.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef0514(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
