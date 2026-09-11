package com.emd;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Acc_menu {
    public void show(Stage mainstage) {
        //////////////////////////////////////////////////////////////
        // BUTTONS                                                  //
        //////////////////////////////////////////////////////////////
        
        // JOURNAL
        Button journal = new Button("Journal");
        journal.setStyle("-fx-background-radius: 0px;");
        journal.setPrefSize(400, 80);
        journal.setOnAction(event -> {
            Acc_cvent cvent = new Acc_cvent();
            cvent.show(mainstage);
        });

        // LEDGER
        Button ledger = new Button("Ledger");
        ledger.setStyle("-fx-background-radius: 0px;");
        ledger.setPrefSize(400, 80);

        // ANALYSIS
        Button analysis = new Button("Analysis");
        analysis.setStyle("-fx-background-radius: 0px;");
        analysis.setPrefSize(400, 80);

        //////////////////////////////////////////////////////////////
        // SCENES/FRAMES                                            //
        //////////////////////////////////////////////////////////////
        
        // BUTTON SCENE
        VBox buttonscene = new VBox(10, journal, ledger, analysis);
        buttonscene.setPrefSize(1280, 720);
        buttonscene.setAlignment(Pos.CENTER);   
        
        // ACC MENU SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        Scene acc_scene = new Scene(buttonscene, width, height);

        // LOAD ACC MENU SCENE
        mainstage.setScene(acc_scene); 
    }
}
