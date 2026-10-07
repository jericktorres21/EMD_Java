package com.emd;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class Acc_cvent {
    private VBox code_box;
    private VBox title_box;
    private VBox debit_box;
    private VBox credit_box;
    private VBox hda_box;
    private VBox exp_box;
    private VBox sub_box;

    // INITIALIZE
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
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        date_entry.setAlignment(Pos.CENTER);
        date_entry.setPrefSize(90, 23);

        // CHECK VOUCHER NO.
        TextField cv_numentry = new TextField();
        cv_numentry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        cv_numentry.setAlignment(Pos.CENTER);
        cv_numentry.setPrefSize(90, 23);
        // CHECK NO.
        TextField check_entry = new TextField();
        check_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_entry.setAlignment(Pos.CENTER);
        check_entry.setPrefSize(90, 23);
        // CHECK AMOUNT
        TextField check_amtentry = new TextField();
        check_amtentry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        check_amtentry.setAlignment(Pos.CENTER);
        check_amtentry.setText("0.00");
        check_amtentry.setPrefSize(90, 23);
        // PAYEE
        ComboBox<String> payee_entry = new ComboBox<>();
        payee_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        payee_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        payee_entry.setEditable(true);
        payee_entry.setPrefSize(350, 23);
        payee_entry.setMinSize(350, 23);
        payee_entry.setMaxSize(350, 23);
        // GENERAL EXPLANATION
        TextField gen_expentry = new TextField();
        gen_expentry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        gen_expentry.setPrefSize(350, 23);
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
        explanation.setStyle("-fx-font-size: 12px;");
        // SUB-CATEGORY
        Label sub = new Label("Sub-Category");
        sub.setStyle("-fx-font-size: 12px;");          

        //////////////////////////////////////////////////////////////
        // SUM/DIFFERENCE WIDGETS                                   //
        //////////////////////////////////////////////////////////////        

        // DIFFERENCE LABEL
        Label difference = new Label("Difference:");
        difference.setStyle("-fx-font-size: 12px;");
        difference.setTranslateY(4);

        // DIFFERENCE ENTRY BOX
        TextField diff_entry = new TextField();
        diff_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        diff_entry.setAlignment(Pos.CENTER);
        diff_entry.setEditable(false);
        diff_entry.setText("0.00");
        diff_entry.setPrefSize(90, 25);    

        // DEBIT SUM ENTRY BOX
        TextField debit_sum = new TextField();
        debit_sum.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        debit_sum.setAlignment(Pos.CENTER_RIGHT);
        debit_sum.setEditable(false);
        debit_sum.setText("0.00");
        debit_sum.setPrefSize(90, 25);    

        // CREDIT SUM ENTRY BOX
        TextField credit_sum = new TextField();
        credit_sum.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        credit_sum.setAlignment(Pos.CENTER_RIGHT);
        credit_sum.setEditable(false);
        credit_sum.setText("0.00");
        credit_sum.setPrefSize(90, 25);

        //////////////////////////////////////////////////////////////
        // BUTTON WIDGETS                                           //
        //////////////////////////////////////////////////////////////
        
        // ADD NEW PAYEE
        Button new_payee = new Button("+");
        new_payee.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        new_payee.setPrefSize(25, 23);
        VBox.setMargin(new_payee, new Insets(0, 0, 79, 0));  
        new_payee.setOnAction(event -> new Acc_addpayee().show()); 
        
        // ADD NEW HACIENDA
        Button new_hda = new Button("Add Hacienda");
        new_hda.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        new_hda.setPrefSize(100, 40);
        new_hda.setOnAction(event -> new Acc_addhda().show());

        // ADD NEW ACCOUNT TITLE
        Button new_title = new Button("Add New Account");
        new_title.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        new_title.setPrefSize(120, 40);
        new_title.setOnAction(event -> new Acc_addacc().show());

        // VIEW CHECK VOUCHER
        Button view_cv = new Button("View Check Voucher");
        view_cv.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        view_cv.setPrefSize(130, 40);
        
        // ADD NEW PAGE
        Button new_record = new Button("Add Record");
        new_record.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        new_record.setPrefSize(100, 40);        

        // SAVE RECORD BUTTON
        Button save_record = new Button("Save Record");
        save_record.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        save_record.setPrefSize(100, 40);

        // DELETE PAGE BUTTON
        Button delete_page = new Button(" ");
        delete_page.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        delete_page.setPrefSize(45, 40);

        //////////////////////////////////////////////////////////////
        // PAGE WIDGETS                                             //
        //////////////////////////////////////////////////////////////

        // PAGE LABEL
        Label page = new Label("Page");
        page.setStyle("-fx-font-size: 12px;");
        page.setTranslateY(3);

        // PAGE NUMBER 1
        TextField first_num = new TextField();
        first_num.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        first_num.setPrefSize(38, 23);
        first_num.setAlignment(Pos.CENTER);
        first_num.setEditable(false);

        // OF LABEL
        Label of = new Label("of");
        of.setStyle("-fx-font-size: 12px;");
        of.setTranslateY(3);

        // PAGE NUMBER 2
        TextField second_num = new TextField();
        second_num.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        second_num.setPrefSize(38, 23);
        second_num.setAlignment(Pos.CENTER);
        second_num.setEditable(false);

        //////////////////////////////////////////////////////////////
        // PAGE BUTTON WIDGETS                                      //
        //////////////////////////////////////////////////////////////

        Button first_page = new Button("<<");
        first_page.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        first_page.setPrefSize(23, 23); 

        Button back = new Button("<");
        back.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        back.setPrefSize(23, 23);

        Button next = new Button(">");
        next.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        next.setPrefSize(23, 23);

        Button last_page = new Button(">>");
        last_page.setStyle(
            "-fx-font-size: 12px;" +
            "-fx-padding: 0px 0px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        last_page.setPrefSize(23, 23);       

        //////////////////////////////////////////////////////////////
        // VBOX/HBOX/SCENES                                         //
        //////////////////////////////////////////////////////////////
        
        // INFO BOXES
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
        // NEW PAYEE BOX
        VBox new_payeebox = new VBox(new_payee);
        new_payeebox.setAlignment(Pos.CENTER); 

        // INFO BOX
        HBox info_box = new HBox(
            7, 
            info_labels1, 
            info_entrybox1,
            info_labels2,
            info_entrybox2,
            new_payeebox
        );
        info_box.setAlignment(Pos.TOP_CENTER);
        VBox.setMargin(info_box, new Insets(185, 0, 0, 0));

        //////////////////////////////////////////////////////////////

        // ACC ENTRY WIDGETS
        // CODE BOX
        code_box = new VBox(3, code);
        // TITLE BOX
        title_box = new VBox(3, title);
        // DEBIT BOX
        debit_box = new VBox(3, debit);
        // CREDIT BOX
        credit_box = new VBox(3, credit);
        // HACIENDA BOX
        hda_box = new VBox(3, hda);
        // EXPLANATION BOX
        exp_box = new VBox(3, explanation);
        // SUB-CATEGORY BOX
        sub_box = new VBox(3, sub);

        // INITIALIZE ENTRY WIDGETS
        init_cvent_eb();
        // DYNAMIC ENTRY WIDGETS
        cvent_eb();
            
        // DATA ENTRY BOX
        HBox data_enthbox = new HBox(
            5, 
            code_box,
            title_box,
            debit_box,
            credit_box,
            hda_box,
            exp_box,
            sub_box
        );
        data_enthbox.setAlignment(Pos.CENTER);

        // DATA ENTRY SCROLLPANE
        ScrollPane dataentry_sp = new ScrollPane(data_enthbox);
        dataentry_sp.setFitToWidth(true);
        dataentry_sp.setFitToHeight(true);
        dataentry_sp.setMinSize(1180, 305);
        dataentry_sp.setMaxSize(1180, 305); 
        dataentry_sp.setStyle("-fx-background-color: #ADD8E6;"); 

        // DATA ENTRY STACKPANE
        StackPane dataentry_spbox = new StackPane(dataentry_sp);

        //////////////////////////////////////////////////////////////

        // DIFFERENCE BOX
        HBox diff_box = new HBox(5, difference, diff_entry);
        diff_box.setTranslateX(600);

        // DEBIT-CREDIT SUM BOX
        HBox sum_box = new HBox(5, debit_sum, credit_sum);
        sum_box.setTranslateX(614);

        // PAGE HBOX
        HBox sumdiffbox = new HBox(20, diff_box, sum_box);
        sumdiffbox.setPrefSize(0, 27);

        //////////////////////////////////////////////////////////////
        
        // BUTTON HBOX 1
        HBox buttonbox_1 = new HBox(
            4,
            new_hda,
            new_title
        );
        buttonbox_1.setAlignment(Pos.CENTER);

        // BUTTON HBOX 2
        HBox buttonbox_2 = new HBox(
            4,
            view_cv,
            new_record,
            save_record
        );
        
        // BUTTON WIDGETS 
        HBox buttonbox = new HBox(
            40,
            buttonbox_1,
            buttonbox_2,
            delete_page
        );
        buttonbox.setAlignment(Pos.CENTER);
        buttonbox.setTranslateY(10);

        //////////////////////////////////////////////////////////////

        // PAGE NUMBER BOX
        HBox pagenum_box = new HBox(5, page, first_num, of, second_num);

        //////////////////////////////////////////////////////////////

        // PAGE NAVIGATION BOX
        HBox pagenav_box = new HBox(5, first_page, back, next, last_page);

        //////////////////////////////////////////////////////////////

        // PAGE BOX
        HBox pagebox = new HBox(30, pagenum_box, pagenav_box);
        pagebox.setAlignment(Pos.CENTER);
        pagebox.setTranslateY(15);

        //////////////////////////////////////////////////////////////        

        // MAIN BOX
        VBox mainbox = new VBox(
            20, 
            info_box, 
            dataentry_spbox, 
            sumdiffbox, 
            buttonbox,
            pagebox
        );

        //////////////////////////////////////////////////////////////

        // ACC CV ENTRY SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        Scene acc_cventscene = new Scene(mainbox, width, height);

        //////////////////////////////////////////////////////////////

        // LOAD ACC CV ENTRY SCENE
        mainstage.setScene(acc_cventscene);
        mainstage.setTitle("Check Voucher Entry");
    }

    // ENTRY BOXES
    private void init_cvent_eb() {
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
        code_box.getChildren().add(code_entry);
        // ACCOUNT TITLE
        ComboBox<String> title_entry = new ComboBox<>();
        title_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        title_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        title_entry.setEditable(true);
        title_entry.setPrefSize(310, 23);
        title_entry.setMinSize(310, 23);
        title_entry.setMaxSize(310, 23);
        title_box.getChildren().add(title_entry);
        // DEBIT
        TextField debit_entry = new TextField();
        debit_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        debit_entry.setAlignment(Pos.CENTER_RIGHT);         
        debit_entry.setText("0.00");         
        debit_entry.setPrefSize(90, 23);
        debit_box.getChildren().add(debit_entry);         
        // CREDIT
        TextField credit_entry = new TextField();
        credit_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        credit_entry.setAlignment(Pos.CENTER_RIGHT);   
        credit_entry.setText("0.00");   
        credit_entry.setPrefSize(90, 23);
        credit_box.getChildren().add(credit_entry);
        // HACIENDA
        ComboBox<String> hda_entry = new ComboBox<>();
        hda_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        hda_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        hda_entry.getEditor().setAlignment(Pos.CENTER);
        hda_entry.setEditable(true);      
        hda_entry.setPrefSize(70, 23); 
        hda_entry.setMinSize(70, 23); 
        hda_entry.setMaxSize(70, 23);
        hda_box.getChildren().add(hda_entry); 
        // EXPLANATION
        TextField explanation_entry = new TextField();
        explanation_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        explanation_entry.setPrefSize(350, 23);
        exp_box.getChildren().add(explanation_entry);
        // SUB-CATEGORY
        ComboBox<String> sub_entry = new ComboBox<>();
        sub_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        sub_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        sub_entry.getEditor().setAlignment(Pos.CENTER);
        sub_entry.setEditable(true);      
        sub_entry.setPrefSize(110, 23);
        sub_entry.setMinSize(110, 23);
        sub_entry.setMaxSize(110, 23);
        sub_box.getChildren().add(sub_entry);
    }

    private void cvent_eb() {
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
        code_entry.textProperty().addListener((obs, oldValue, newValue) -> {
            if (oldValue.isEmpty() && !newValue.isEmpty()) {
                cvent_eb();
            }
        });
        code_box.getChildren().add(code_entry);
        // ACCOUNT TITLE
        ComboBox<String> title_entry = new ComboBox<>();
        title_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        title_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        title_entry.setEditable(true);
        title_entry.setPrefSize(310, 23);
        title_entry.setMinSize(310, 23);
        title_entry.setMaxSize(310, 23);
        title_box.getChildren().add(title_entry);
        // DEBIT
        TextField debit_entry = new TextField();
        debit_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        debit_entry.setAlignment(Pos.CENTER_RIGHT);         
        debit_entry.setText("0.00");         
        debit_entry.setPrefSize(90, 23);
        debit_box.getChildren().add(debit_entry);         
        // CREDIT
        TextField credit_entry = new TextField();
        credit_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        credit_entry.setAlignment(Pos.CENTER_RIGHT);   
        credit_entry.setText("0.00");   
        credit_entry.setPrefSize(90, 23);
        credit_box.getChildren().add(credit_entry);
        // HACIENDA
        ComboBox<String> hda_entry = new ComboBox<>();
        hda_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        hda_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        hda_entry.getEditor().setAlignment(Pos.CENTER);
        hda_entry.setEditable(true);      
        hda_entry.setPrefSize(70, 23); 
        hda_entry.setMinSize(70, 23); 
        hda_entry.setMaxSize(70, 23);
        hda_box.getChildren().add(hda_entry); 
        // EXPLANATION
        TextField explanation_entry = new TextField();
        explanation_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-padding: 0px 5px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-background-radius: 0px;"
        );
        explanation_entry.setPrefSize(350, 23);
        explanation_entry.textProperty().addListener((obs, oldValue, newValue) -> {
            if (oldValue.isEmpty() && !newValue.isEmpty()) {
                cvent_eb();
            }
        });
        exp_box.getChildren().add(explanation_entry);
        // SUB-CATEGORY
        ComboBox<String> sub_entry = new ComboBox<>();
        sub_entry.setStyle(
            "-fx-font-size: 11px;" +
            "-fx-border-color: #A9A9A9;" +
            "-fx-padding: 0px 0px;" +
            "-fx-background-radius: 0px;"
        );
        sub_entry.getEditor().setStyle(
            "-fx-border-color: transparent;" +
            "-fx-padding: 0px 5px;" +
            "-fx-background-insets: 0;" + 
            "-fx-background-radius: 0px;" +
            "-fx-border-width: 0px;"
        );
        sub_entry.getEditor().setAlignment(Pos.CENTER);
        sub_entry.setEditable(true);      
        sub_entry.setPrefSize(110, 23);
        sub_entry.setMinSize(110, 23);
        sub_entry.setMaxSize(110, 23);
        sub_box.getChildren().add(sub_entry);
    }
}