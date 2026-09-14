package com.emd;

import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Acc_addacc {
    public void show() {
        //////////////////////////////////////////////////////////////
        // ENTRY WIDGETS                                            //
        //////////////////////////////////////////////////////////////
         
        // LABELS
        // CODE
        Label code = new Label("Code");
        code.setStyle("-fx-font-size: 12px;");
        // ACCOUNT TITLE
        Label title = new Label("Account Title");
        title.setStyle("-fx-font-size: 12px;");
        // NATURE
        Label nature = new Label("Nature");
        nature.setStyle("-fx-font-size: 12px;");

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
        code_entry.setPrefSize(70, 23);
        // TITLE
        TextField title_entry = new TextField();
        title_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        title_entry.setAlignment(Pos.CENTER);
        title_entry.setPrefSize(350, 23);
        // NATURE
        TextField nature_entry = new TextField();
        nature_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        nature_entry.setAlignment(Pos.CENTER);
        nature_entry.setPrefSize(70, 23);

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
        VBox title_box = new VBox(
            3,
            title,
            title_entry 
        );
        VBox nature_box = new VBox(
            3,
            nature,
            nature_entry
        );

        //////////////////////////////////////////////////////////////

        // MAIN BOX
        HBox mainbox = new HBox(3, code_box, title_box, nature_box);

        //////////////////////////////////////////////////////////////

        // ACC CV ENTRY SCENE
        Scene addacc_scene = new Scene(mainbox, 840, 560);

        //////////////////////////////////////////////////////////////  
         
        Stage addacc_stage = new Stage();

        // LOAD ACC CV ENTRY SCENE
        addacc_stage.setScene(addacc_scene); 
    }
}
