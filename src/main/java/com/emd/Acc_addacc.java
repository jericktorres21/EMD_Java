package com.emd;

import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

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
        title_entry.setPrefSize(350, 23);
        // NATURE
        ComboBox<String> nature_entry = new ComboBox<>();
        nature_entry.getItems().addAll(
            "Asset",
            "Liability",
            "Equity",
            "Revenue",
            "Expense"
        );
        nature_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        nature_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        nature_entry.getEditor().setAlignment(Pos.CENTER);
        nature_entry.setEditable(true);         
        nature_entry.setPrefSize(90, 23);
        nature_entry.setMinSize(90, 23);
        nature_entry.setMaxSize(90, 23);

        //////////////////////////////////////////////////////////////
        // BUTTON WIDGETS                                           //
        //////////////////////////////////////////////////////////////

        // SAVE RECORD
        Button save_record = new Button("Save Record");
        save_record.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        save_record.setPrefSize(100, 40);

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

        // MAIN ENTRY BOX
        HBox entry_box = new HBox(3, code_box, title_box, nature_box);
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

        // ADD ACCOUNTS SCENE
        Scene addacc_scene = new Scene(mainbox, 590, 700);

        //////////////////////////////////////////////////////////////  
        
        // ADD ACCOUNT STAGE
        Stage addacc_stage = new Stage();

        // LOAD STAGE
        addacc_stage.setScene(addacc_scene);
        addacc_stage.setTitle("Chart of Accounts");
        addacc_stage.show();
    }
}