package com.emd;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        Application.setUserAgentStylesheet(
                new PrimerLight().getUserAgentStylesheet()
        );

        StackPane window = new StackPane();
        GridPane buttongrid = new GridPane();

        // ACCOUNTING BUTTON
        Button acc = new Button("Accounting");
        acc.setStyle("-fx-background-radius: 0px;");
        acc.setPrefSize(400, 80);

        // SUGAR BUTTON
        Button sug = new Button("Sugar");
        sug.setStyle("-fx-background-radius: 0px;");
        sug.setPrefSize(400, 80);

        window.getChildren().addAll(acc, sug);

        // buttongrid.add(acc, 0, 0);
        // buttongrid.add(sug, 1, 0);

        Scene scene = new Scene(window, 1280, 720);

        stage.setTitle("EMD");
        stage.setScene(scene);
        stage.show();
    }
}