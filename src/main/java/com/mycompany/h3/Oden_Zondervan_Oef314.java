package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef314 {
    private final Rectangle body, paal;
    private final Circle groenLicht, oranjeLicht, roodLicht;

    public  Oden_Zondervan_Oef314(Pane p){
        body = new Rectangle(150, 310);
        paal = new Rectangle(50, 300);
        groenLicht = new Circle(50);
        oranjeLicht = new Circle(50);
        roodLicht = new Circle(50);

        body.relocate(270, 290);
        paal.relocate(320, 600);
        groenLicht.relocate(300, 300);
        oranjeLicht.relocate(300, 400);
        roodLicht.relocate(300, 500);

        groenLicht.setFill(Color.GREEN);
        oranjeLicht.setFill(Color.ORANGE);
        roodLicht.setFill(Color.RED);

        p.getChildren().addAll(body, paal, groenLicht, oranjeLicht, roodLicht);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef314.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 1000, 800);
            new Oden_Zondervan_Oef314(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
