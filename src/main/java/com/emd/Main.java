package com.emd;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

        Button button = new Button("Hello JavaFX + AtlantaFX");
        button.setStyle("-fx-background-radius: 0px;");
        button.setPrefWidth(200);
        button.setPrefHeight(50);

        StackPane window = new StackPane(button);

        Scene scene = new Scene(window, 1280, 720);

        stage.setTitle("EMD");
        stage.setScene(scene);
        stage.show();
    }
}