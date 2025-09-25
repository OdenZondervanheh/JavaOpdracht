package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Oden_Zondervan_Oef308 {

    private final Rectangle huisbody;
    private final Polygon huisdak;

    public Oden_Zondervan_Oef308(Pane p){
        huisbody = new Rectangle(60, 150, 130, 150);
        huisbody.setFill(Color.RED);


        huisdak = new Polygon(125, 50, 200, 150, 50, 150);
        huisdak.setFill(Color.BLUE);

        p.getChildren().addAll(huisbody,huisdak);
    }

    // Toegevoegd voor convenience (anders moet je {naam}$launcher doen voor run)
    public static void main(String[] args) {
        Oden_Zondervan_Oef308.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef308(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
