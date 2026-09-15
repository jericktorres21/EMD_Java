package com.emd;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Acc_addhda {
    public void show() {
        //////////////////////////////////////////////////////////////
        // ENTRY WIDGETS                                            //
        //////////////////////////////////////////////////////////////
         
        // LABELS
        // CODE
        Label code = new Label("Code");
        code.setStyle("-fx-font-size: 12px;"); 
        // HACIENDA
        Label hda = new Label("Hacienda");
        hda.setStyle("-fx-font-size: 12px;");
        // SHORTCUT
        Label shortcut = new Label("Shortcut");
        shortcut.setStyle("-fx-font-size: 12px;");

        //////////////////////////////////////////////////////////////   
        
        // ENTRY BOXES
        // CODE
        TextField code_entry = new TextField();
        code_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        code_entry.setAlignment(Pos.CENTER);
        code_entry.setPrefSize(50, 23);
        code_entry.setMinSize(50, 23);
        code_entry.setMaxSize(50, 23);
        // HACIENDA
        TextField hda_entry = new TextField();
        hda_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        hda_entry.setPrefSize(140, 23);
        hda_entry.setMinSize(140, 23);
        hda_entry.setMaxSize(140, 23);
        // SHORTCUT
        TextField shortcut_entry = new TextField();
        shortcut_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        shortcut_entry.setAlignment(Pos.CENTER);
        shortcut_entry.setPrefSize(70, 23);
        shortcut_entry.setMinSize(70, 23);
        shortcut_entry.setMaxSize(70, 23);

        //////////////////////////////////////////////////////////////
        // ENTRY WIDGETS                                            //
        //////////////////////////////////////////////////////////////
        
        // SAVE RECORD
        Button save_record = new Button("Save Record");
        save_record.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        save_record.setPrefSize(130, 40); 
        
        //////////////////////////////////////////////////////////////
        // VBOX/HBOX/SCENES                                         //
        //////////////////////////////////////////////////////////////
         
        // ENTRY BOXES
        // CODE
        VBox code_box = new VBox(
            3,
            code,
            code_entry
        );
        // TITLE
        VBox hda_box = new VBox(
            3,
            hda,
            hda_entry 
        );
        VBox shortcut_box = new VBox(
            3,
            shortcut,
            shortcut_entry
        );

        // MAIN ENTRY BOX
        HBox entry_box = new HBox(3, code_box, hda_box, shortcut_box);
        entry_box.setAlignment(Pos.CENTER);
        VBox.setMargin(entry_box, new Insets(20, 0, 0, 0));

        //////////////////////////////////////////////////////////////

        // BUTTON BOXES
        HBox button_box = new HBox(3, save_record);
        button_box.setAlignment(Pos.CENTER);
        VBox.setMargin(button_box, new Insets(30, 0, 0, 0));

        //////////////////////////////////////////////////////////////        

        // MAIN BOX
        VBox mainbox = new VBox(3, entry_box, button_box);

        //////////////////////////////////////////////////////////////

        // ADD HACIENDA SCENE
        Scene addhda_scene = new Scene(mainbox, 350, 400);

        //////////////////////////////////////////////////////////////  
         
        // ADD HACIENDA STAGE
        Stage addhda_stage = new Stage();

        // LOAD STAGE
        addhda_stage.setScene(addhda_scene);
        addhda_stage.setTitle("List of Haciendas");
        addhda_stage.show();    
    }
}