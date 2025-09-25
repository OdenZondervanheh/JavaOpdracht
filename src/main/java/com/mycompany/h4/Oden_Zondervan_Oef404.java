package com.mycompany.h4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef404 {

    private final TextField bedragveld, subtotaalveld, btwveld, anderbtwveld, totaalveld;
    private final Label bedraglable, sublable, btwlable, anderbtwlable, totaallable;
    private final Button totaal, reset;
    private final Kassa kassa;

    public Oden_Zondervan_Oef404(GridPane p) {

        bedraglable = new Label("Voer bedrag in");
        sublable = new Label("Subtotaal");
        btwlable = new Label("btw");
        anderbtwlable = new Label("Totaal ex btw");
        totaallable = new Label("Totaal");

        bedragveld = new TextField();
        subtotaalveld = new TextField();
        btwveld = new TextField();
        anderbtwveld = new TextField();
        totaalveld = new TextField();

        totaal = new Button("totaal");
        reset  = new Button("reset");
        kassa = new Kassa();

        totaal.setOnAction(event ->{
            String invoer1 = bedragveld.getText();
            double bedrag = Double.parseDouble(invoer1);
            kassa.telOp(bedrag);
            double subtotaal = kassa.getSubtotaal();
            double btw = kassa.berekenBTW();
            double bereken = kassa.berekenSubtotaalExBTW();

            subtotaalveld.setText(String.format("%.2f", subtotaal));
            btwveld.setText(String.format("%.2f", btw));
            anderbtwveld.setText(String.format("%.2f", bereken));
            totaalveld.setText(String.format("%.2f", subtotaal));
        });

        reset.setOnAction(event ->{
            kassa.reset();

            bedragveld.clear();
            subtotaalveld.clear();
            btwveld.clear();
            anderbtwveld.clear();
            totaalveld.clear();
        });

        p.add(bedraglable,0,0);
        p.add(sublable,0,1);
        p.add(btwlable,0,2);
        p.add(anderbtwlable,0,3);
        p.add(totaallable,0,4);

        p.add(bedragveld,1,0);
        p.add(subtotaalveld,1,1);
        p.add(btwveld,1,2);
        p.add(anderbtwveld,1,3);
        p.add(totaalveld,1,4);

        p.add(totaal,2,1);
        p.add(reset,2,4);
    }

    public static void main(String[] args) {
        Oden_Zondervan_Oef404.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            GridPane root = new GridPane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef404(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}

 class Kassa {
    private double subtotaal;
    private final double PERCENTAGE_BTW = 21.0;

    public void telOp ( double bedrag) {
        subtotaal += bedrag;
    }

    public double getSubtotaal(){
        return subtotaal;
    }

    public void reset() {
        subtotaal = 0;
    }

    public double berekenBTW() {
        return subtotaal - berekenSubtotaalExBTW();
    }

    public double berekenSubtotaalExBTW(){
        return subtotaal / (1 + PERCENTAGE_BTW/100);
    }
}