package com.mycompany.h4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.Math;

public class Oden_Zondervan_Oef405 {

    private Text resultaatText;
    private doubelsteentje dobbelsteen, dobbelsteen2;
    private int resultaat, resultaat2;
    private Button random;


    public Oden_Zondervan_Oef405(GridPane p) {
        resultaatText = new Text();
        random = new Button("Random");
        dobbelsteen = new doubelsteentje();
        dobbelsteen2 = new doubelsteentje();

        resultaat = dobbelsteen.gooi();
        resultaat2 = dobbelsteen2.gooi();

        resultaatText.setText("" + resultaat + " " + resultaat2);

        p.add(resultaatText,0,2);
        p.add(random,0,3);

        random.setOnAction(event ->{
            resultaat = dobbelsteen.gooi();
            resultaat2 = dobbelsteen2.gooi();

            resultaatText.setText("" + resultaat + " " + resultaat2);
        });
    }

    public class doubelsteentje {
        public int gooi() {
            double resultaat = Math.random();
            resultaat *= 6;
            resultaat += 1;
            return (int) resultaat;
        }
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef405.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef405(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
