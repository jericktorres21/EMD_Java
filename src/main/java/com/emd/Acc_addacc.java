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
    // VBOXES
    private VBox code_box;
    private VBox title_box;
    private VBox nature_box;
    // INIT ENTRY VARIABLES
    private TextField init_code_entry;
    private TextField init_title_entry;
    private ComboBox<String> init_nature_entry;

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
        code_box = new VBox(3, code);
        // TITLE
        title_box = new VBox(3, title);
        // NATURE
        nature_box = new VBox(3, nature);

        // INITIALIZE ENTRY WIDGETS
        init_addacc_eb();

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

    private void init_addacc_eb() {
        // ENTRY BOXES
        // CODE
        init_code_entry = new TextField();
        init_code_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        init_code_entry.setAlignment(Pos.CENTER);
        init_code_entry.setPrefSize(70, 23);
        code_box.getChildren().add(init_code_entry);
        // TITLE
        init_title_entry = new TextField();
        init_title_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        init_title_entry.setPrefSize(350, 23);
        title_box.getChildren().add(init_title_entry);
        // NATURE
        init_nature_entry = new ComboBox<>();
        init_nature_entry.getItems().addAll(
            "Asset",
            "Liability",
            "Equity",
            "Revenue",
            "Expense"
        );
        init_nature_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        init_nature_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        init_nature_entry.getEditor().setAlignment(Pos.CENTER);
        init_nature_entry.setEditable(true);         
        init_nature_entry.setPrefSize(90, 23);
        init_nature_entry.setMinSize(90, 23);
        init_nature_entry.setMaxSize(90, 23);
        nature_box.getChildren().add(init_nature_entry);
    }
}