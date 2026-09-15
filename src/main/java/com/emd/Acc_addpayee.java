package com.emd;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Acc_addpayee {
    public void show() {
       //////////////////////////////////////////////////////////////
        // ENTRY WIDGETS                                            //
        //////////////////////////////////////////////////////////////
         
        // LABELS
        // CODE
        Label code = new Label("Code");
        code.setStyle("-fx-font-size: 12px;"); 
        // PAYEE
        Label payee = new Label("Payee");
        payee.setStyle("-fx-font-size: 12px;");

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
        code_entry.setMinSize(70, 23);
        code_entry.setMaxSize(70, 23);
        // HACIENDA
        TextField payee_entry = new TextField();
        payee_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        payee_entry.setPrefSize(350, 23);
        payee_entry.setMinSize(350, 23);
        payee_entry.setMaxSize(350, 23);

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
        VBox payee_box = new VBox(
            3,
            payee,
            payee_entry 
        );

        // MAIN ENTRY BOX
        HBox entry_box = new HBox(3, code_box, payee_box);
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

        // ADD PAYEE SCENE
        Scene addpayee_scene = new Scene(mainbox, 490, 600);

        //////////////////////////////////////////////////////////////  
         
        // ADD PAYEE STAGE
        Stage addpayee_stage = new Stage();

        // LOAD STAGE
        addpayee_stage.setScene(addpayee_scene);
        addpayee_stage.setTitle("List of Payees");
        addpayee_stage.show();    
    }
}
