package com.mycompany.h3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Oden_Zondervan_Oef304 {
    private final int leeftijdseconden, jaren, weken, dagen, uren, minuten, seconden;
    private final Text privatetext;
    private final Text textdatum;

    private static final int SEC_PER_MIN = 60;
    private static final int SEC_PER_UUR = 3_600; // 60 * 60 (sec > min > uur)
    private static final int SEC_PER_DAG = 86_400; // 60 * 60 * 24 (sec > min > uur > dag)
    private static final int SEC_PER_WEEK = 604_800; // 60 * 60 * 24 * 7 (sec > min > uur > dag > week)
    private static final int SEC_PER_JAAR = 31_536_000; // 60 * 60 * 24 * 365 (sec > min > uur > dag > jaar)

    public Oden_Zondervan_Oef304(Pane p) {

        leeftijdseconden = 5_454_532;
        uren = leeftijdseconden / SEC_PER_UUR;
        minuten = (leeftijdseconden % SEC_PER_UUR) / SEC_PER_MIN;
        seconden = leeftijdseconden % SEC_PER_MIN;

        jaren = leeftijdseconden / SEC_PER_JAAR;
        weken = (leeftijdseconden % SEC_PER_JAAR) / SEC_PER_WEEK;
        dagen = ((leeftijdseconden % SEC_PER_JAAR) % SEC_PER_WEEK) / SEC_PER_DAG;


        privatetext = new Text(50, 30,
                 uren + " Uren " + minuten + " Minuten " + seconden + " Seconden ");

        textdatum = new Text(50, 50,
                 jaren + " Jaren " + weken  +  "Weken " + dagen + " Dagen ");

        p.getChildren().add(privatetext);
        p.getChildren().add(textdatum);
    }

    // Toegevoegd voor convenience (anders moet je {naam}$launcher doen voor run)
    public static void main(String[] args) {
        Oden_Zondervan_Oef304.Launcher.main(args);
    }

    // Launch JavaFX klasse
    public static class Launcher extends Application {
        @Override
        public void start(Stage stage) {
            Pane root = new Pane();
            StackPane stackpane = new StackPane(root);

            var scene = new Scene(stackpane, 800, 600);
            new Oden_Zondervan_Oef304(root);

            stage.setScene(scene);
            stage.setTitle("Opdrachten 3.03 en 23.04");
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}





