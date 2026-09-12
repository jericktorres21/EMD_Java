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
        
        // LABELS
        // DATE
        Label date = new Label("Date");
        // CHECK VOUCHER NO.
        Label cv_num = new Label("CV No.");
        // CHECK NO.
        Label check = new Label("Check No.");
        // CHECK AMOUNT
        Label check_amt = new Label("Check Amount");
        // PAYEE
        Label payee = new Label("Payee");
        // GENERAL EXPLANATION
        Label gen_explanation = new Label("Explanation");
        
        // ENTRY BOXES
        // DATE
        TextField date_entry = new TextField();
        date_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        date_entry.setAlignment(Pos.CENTER);
        // CHECK VOUCHER NO.
        TextField cv_numentry = new TextField();
        cv_numentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        cv_numentry.setAlignment(Pos.CENTER);
        // CHECK NO.
        TextField check_entry = new TextField();
        check_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_entry.setAlignment(Pos.CENTER);
        // CHECK AMOUNT
        TextField check_amtentry = new TextField();
        check_amtentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_amtentry.setAlignment(Pos.CENTER);
        // PAYEE
        TextField payee_entry = new TextField();
        payee_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 100px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        // GENERAL EXPLANATION
        TextField gen_expentry = new TextField();
        gen_expentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 3px 100px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        //////////////////////////////////////////////////////////////
        // SCENES/FRAMES/VBOX/HBOX                                  //
        //////////////////////////////////////////////////////////////
        
        // LABEL HBOX 1
        VBox info_labels1 = new VBox(
            7, 
            date, 
            cv_num, 
            check,
            check_amt
        );
        info_labels1.setAlignment(Pos.CENTER);

        // ENTRY HBOX 1
        VBox info_entrybox1 = new VBox(
            3, 
            date_entry, 
            cv_numentry,
            check_entry,
            check_amtentry
        );
        info_entrybox1.setAlignment(Pos.CENTER);

        // LABEL HBOX 2
        VBox info_labels2 = new VBox(
            7, 
            payee,
            gen_explanation
        );
        info_labels2.setAlignment(Pos.CENTER);

        // ENTRY HBOX 2
        VBox info_entrybox2 = new VBox(
            3, 
            payee_entry,
            gen_expentry
        );
        info_entrybox2.setAlignment(Pos.CENTER);      

        // INFO VBOX
        HBox info_box = new HBox(
            7, 
            info_labels1, 
            info_entrybox1,
            info_labels2,
            info_entrybox2
        );
        info_box.setAlignment(Pos.TOP_CENTER);

        // ACC CV ENTRY SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        Scene acc_scene = new Scene(info_box, width, height);

        // LOAD ACC CV ENTRY SCENE
        mainstage.setScene(acc_scene); 
    }
}