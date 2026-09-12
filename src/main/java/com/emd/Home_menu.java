package com.emd;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Home_menu {
    public void show(Stage mainstage) {
        //////////////////////////////////////////////////////////////
        // BUTTONS                                                  //
        //////////////////////////////////////////////////////////////

        // ACCOUNTING
        Button acc = new Button("Accounting");
        acc.setStyle("-fx-background-radius: 0px;");
        acc.setPrefSize(400, 80);
        acc.setOnAction(event -> {
            Acc_menu accmenu = new Acc_menu();
            accmenu.show(mainstage);
        });

        // SUGAR
        Button sug = new Button("Sugar");
        sug.setStyle("-fx-background-radius: 0px;");
        sug.setPrefSize(400, 80);

        // DATABASE
        Button dat = new Button("Database");
        dat.setStyle("-fx-background-radius: 0px;");
        dat.setPrefSize(400, 80);

        // OTHERS
        Button others = new Button("Others");
        others.setStyle("-fx-background-radius: 0px;");
        others.setPrefSize(400, 80);

        //////////////////////////////////////////////////////////////
        // SCENES/FRAMES                                            //
        //////////////////////////////////////////////////////////////        

        // BUTTON SCENE
        VBox buttonscene = new VBox(5, acc, sug, dat, others);
        buttonscene.setPrefSize(1280, 720);
        buttonscene.setAlignment(Pos.CENTER);      

        // MAIN SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();
        
        Scene mainscene = new Scene(buttonscene, width, height);

        // LOAD MAIN SCENE
        mainstage.setScene(mainscene);
    }
}
