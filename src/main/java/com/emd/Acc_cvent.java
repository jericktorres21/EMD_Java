package com.emd;

import javafx.geometry.Insets;
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
        // INFO WIDGETS                                             //
        //////////////////////////////////////////////////////////////
        
        // LABELS
        // DATE
        Label date = new Label("Date");
        date.setStyle("-fx-font-size: 12px;");
        // CHECK VOUCHER NO.
        Label cv_num = new Label("CV No.");
        cv_num.setStyle("-fx-font-size: 12px;");
        // CHECK NO.
        Label check = new Label("Check No.");
        check.setStyle("-fx-font-size: 12px;");
        // CHECK AMOUNT
        Label check_amt = new Label("Check Amount");
        check_amt.setStyle("-fx-font-size: 12px;");
        // PAYEE
        Label payee = new Label("Payee");
        payee.setStyle("-fx-font-size: 12px;");
        // GENERAL EXPLANATION
        Label gen_explanation = new Label("Explanation");
        gen_explanation.setStyle("-fx-font-size: 12px;");
        // ADJUST MARGIN
        VBox.setMargin(gen_explanation, new Insets(0, 0, 53, 0));
        
        // ENTRY BOXES
        // DATE
        TextField date_entry = new TextField();
        date_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        date_entry.setAlignment(Pos.CENTER);
        // CHECK VOUCHER NO.
        TextField cv_numentry = new TextField();
        cv_numentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        cv_numentry.setAlignment(Pos.CENTER);
        // CHECK NO.
        TextField check_entry = new TextField();
        check_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_entry.setAlignment(Pos.CENTER);
        // CHECK AMOUNT
        TextField check_amtentry = new TextField();
        check_amtentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_amtentry.setAlignment(Pos.CENTER);
        // PAYEE
        TextField payee_entry = new TextField();
        payee_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 90px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        // GENERAL EXPLANATION
        TextField gen_expentry = new TextField();
        gen_expentry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 90px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        // ADJUST MARGIN
        VBox.setMargin(gen_expentry, new Insets(0, 0, 53, 0));

        //////////////////////////////////////////////////////////////
        // ACC ENTRY WIDGETS                                        //
        //////////////////////////////////////////////////////////////
       
        // LABELS
        // CODE
        Label code = new Label("Code");
        code.setStyle("-fx-font-size: 12px;");
        // ACCOUNT TITLE
        Label title = new Label("Account Title");
        title.setStyle("-fx-font-size: 12px;");
        // DEBIT
        Label debit = new Label("Debit");
        debit.setStyle("-fx-font-size: 12px;");
        // CREDIT
        Label credit = new Label("Credit");
        credit.setStyle("-fx-font-size: 12px;");
        // HACIENDA
        Label hda = new Label("HDA.");
        hda.setStyle("-fx-font-size: 12px;");
        // EXPLANATION
        Label explanation = new Label("Explanation");
        explanation.setStyle("-fx-font-size; 12px;");
        // SUB-CATEGORY
        Label sub = new Label("Sub-Category");
        sub.setStyle("-fx-font-size; 12px;");          

        // DATA ENTRY BOXES
        // CODE
        TextField code_entry = new TextField();
        code_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        code_entry.setAlignment(Pos.CENTER);
        // ACCOUNT TITLE
        TextField title_entry = new TextField();
        title_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 90px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        // DEBIT
        TextField debit_entry = new TextField();
        debit_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        debit_entry.setAlignment(Pos.CENTER_RIGHT);         
        // CREDIT
        TextField credit_entry = new TextField();
        credit_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        credit_entry.setAlignment(Pos.CENTER_RIGHT);   
        // HACIENDA
        TextField hda_entry = new TextField();
        hda_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        hda_entry.setAlignment(Pos.CENTER);   
        // EXPLANATION
        TextField explanation_entry = new TextField();
        explanation_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 90px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        explanation_entry.setAlignment(Pos.CENTER); 
        // SUB-CATEGORY
        TextField sub_entry = new TextField();
        sub_entry.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 2px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        sub_entry.setAlignment(Pos.CENTER);

        //////////////////////////////////////////////////////////////
        // SCENES/FRAMES/VBOX/HBOX                                  //
        //////////////////////////////////////////////////////////////
        
        // LABEL INFO BOX 1
        VBox info_labels1 = new VBox(
            9, 
            date, 
            cv_num, 
            check,
            check_amt
        );
        info_labels1.setAlignment(Pos.CENTER);
        // ENTRY INFO BOX 1
        VBox info_entrybox1 = new VBox(
            3, 
            date_entry, 
            cv_numentry,
            check_entry,
            check_amtentry
        );
        info_entrybox1.setAlignment(Pos.CENTER);
        // LABEL INFO BOX 2
        VBox info_labels2 = new VBox(
            9, 
            payee,
            gen_explanation
        );
        info_labels2.setAlignment(Pos.CENTER);
        // ENTRY INFO BOX 2
        VBox info_entrybox2 = new VBox(
            3, 
            payee_entry,
            gen_expentry
        );
        info_entrybox2.setAlignment(Pos.CENTER);      
        // INFO BOX
        HBox info_box = new HBox(
            7, 
            info_labels1, 
            info_entrybox1,
            info_labels2,
            info_entrybox2
        );
        info_box.setAlignment(Pos.TOP_CENTER);
        VBox.setMargin(info_box, new Insets(190, 0, 0, 0));

        // CODE BOX
        VBox code_box = new VBox(3, code, code_entry);
        // TITLE BOX
        VBox title_box = new VBox(3, title, title_entry);
        // DEBIT BOX
        VBox debit_box = new VBox(3, debit, debit_entry);
        // CREDIT BOX
        VBox credit_box = new VBox(3, credit, credit_entry);
        // HACIENDA BOX
        VBox hda_box = new VBox(3, hda, hda_entry);
        // EXPLANATION BOX
        VBox exp_box = new VBox(3, explanation, explanation_entry);
        // SUB-CATEGORY BOX
        VBox sub_box = new VBox(3, sub, sub_entry);

        // DATA ENTRY BOX
        HBox data_entbox = new HBox(
            5, 
            code_box,
            title_box,
            debit_box,
            credit_box,
            hda_box,
            exp_box,
            sub_box
        );
        data_entbox.setAlignment(Pos.CENTER);

        // MAIN BOX
        VBox mainbox = new VBox(30, info_box, data_entbox);

        // ACC CV ENTRY SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        Scene acc_scene = new Scene(mainbox, width, height);

        // LOAD ACC CV ENTRY SCENE
        mainstage.setScene(acc_scene); 
    }
}