package com.emd;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Acc_cvent {
    public void show(Stage mainstage) {
        //////////////////////////////////////////////////////////////
        // ENTRIES                                                  //
        //////////////////////////////////////////////////////////////
        
        // DATE
        // LABEL
        Label date_label = new Label("Date");
        // ENTRY BOX
        TextField date_entry = new TextField();
        date_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 5px 7px;" +
            "-fx-background-radius: 0px;"
        );
        date_entry.setAlignment(Pos.CENTER_LEFT);

        //////////////////////////////////////////////////////////////
        // SCENES/FRAMES/VBOX/HBOX                                  //
        //////////////////////////////////////////////////////////////
        
        // DATE HBOX
        HBox date_box = new HBox(5, date_label, date_entry);
        date_box.setAlignment(Pos.CENTER);

        // INFO VBOX
        VBox info_box = new VBox(date_box);
        info_box.setAlignment(Pos.CENTER);

        // ACC CV ENTRY SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        Scene acc_scene = new Scene(info_box, width, height);

        // LOAD ACC CV ENTRY SCENE
        mainstage.setScene(acc_scene); 
    }
}