package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef315 {
    private final Rectangle body;
    private final Circle stip1, stip2, stip3;
    public Oden_Zondervan_Oef315(Pane p){
        body = new Rectangle(50, 50, 200, 200);
        stip1 = new Circle(20);
        stip2 = new Circle(20);
        stip3 = new Circle(20);

        body.relocate(300, 300);
        stip1.relocate(330,320);
        stip2.relocate(380,370);
        stip3.relocate(430,430);

        body.setFill(Color.WHITE);
        body.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 2;");
        body.setArcWidth(30);
        body.setArcHeight(30);


        p.getChildren().addAll(body, stip1, stip2, stip3);

    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef315.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef315(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
