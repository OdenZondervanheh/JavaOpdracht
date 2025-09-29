package com.mycompany.h5;

import com.mycompany.h4.Oden_Zondervan_Oef406;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class Oden_Zondervan_Oef052
{
    private final TextField invoervak1, invoervak2, invoervak3;
    private final Button berekeningButton;
    private final Text resultaatText;

    public Oden_Zondervan_Oef052(GridPane p) {
        invoervak1 = new TextField();
        invoervak2 = new TextField();
        invoervak3 = new TextField();
        berekeningButton = new Button("yo yo yo button");
        resultaatText = new Text();

        resultaatText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        berekeningButton.setOnAction(event ->{
            String invoervakje1 = invoervak1.getText();
            int getalletje1 = Integer.parseInt(invoervakje1);
            String invoervakje2 = invoervak2.getText();
            int getalletje2 = Integer.parseInt(invoervakje2);
            String invoervakje3 = invoervak3.getText();
            int getalletje3 = Integer.parseInt(invoervakje3);

            int[] getalArray = {getalletje1, getalletje2, getalletje3};
            Arrays.sort(getalArray);

            resultaatText.setText(Arrays.toString(getalArray));

            invoervak1.clear();
            invoervak2.clear();
            invoervak3.clear();
        });

        p.add(invoervak1, 0,0);
        p.add(invoervak2, 1,0);
        p.add(invoervak3, 2,0);
        p.add(berekeningButton, 3,0);
        p.add(resultaatText, 0,1);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef052.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef052(root);

            stage.setScene(scene);
            stage.setTitle("Java opdracht");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
