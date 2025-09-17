package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Oden_Zondervan_Oef311 {
    private final Circle cirkol;
    private final Button links, rechts;
    private int xcordinaaat;


    public Oden_Zondervan_Oef311(Pane p) {
        cirkol = new Circle(100);
        links = new Button( "Naar links" );
        rechts  = new Button( "Naar rechts" );
        xcordinaaat = 300;
        cirkol.setFill(Color.CHOCOLATE);

        links.setOnAction(actionEvent -> {
            xcordinaaat = xcordinaaat - 100;
            cirkol.relocate(xcordinaaat, 100);
        });

        rechts.setOnAction(actionEvent -> {
            xcordinaaat = xcordinaaat + 100;
            cirkol.relocate(xcordinaaat, 100);
        });

        cirkol.relocate(300, 300);
        links.relocate(100, 50);
        rechts.relocate(200, 20);

        p.getChildren().addAll(cirkol, links, rechts);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef311.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef311(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
