package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef312 {

    private final Circle cirkol;
    private final Button links, rechts, groter, kleiner;
    private int xcordinaaat;
    private int cirkelStraal;

    public Oden_Zondervan_Oef312(Pane p) {
        cirkol = new Circle(100);
        links = new Button( "Naar links" );
        rechts  = new Button( "Naar rechts" );
        groter = new Button( "groter" );
        kleiner  = new Button( "kleiner" );

        cirkelStraal = 100;
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

        groter.setOnAction((actionEvent -> {
            cirkelStraal = cirkelStraal + 5;
            cirkol.setRadius(cirkelStraal);
        }));

        kleiner.setOnAction((actionEvent -> {
            cirkelStraal = cirkelStraal - 5;
            cirkol.setRadius(cirkelStraal);
        }));

        cirkol.relocate(300, 300);
        links.relocate(40, 50);
        rechts.relocate(110, 50);
        groter.relocate(40, 20);
        kleiner.relocate(110, 20);


        p.getChildren().addAll(cirkol, links, rechts, groter, kleiner);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef312.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef312(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
