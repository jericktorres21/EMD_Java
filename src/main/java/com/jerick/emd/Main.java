package com.jerick.emd;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Application.setUserAgentStylesheet(
                new PrimerLight().getUserAgentStylesheet()
        );

        Button button = new Button("Hello JavaFX + AtlantaFX!");
        button.setStyle("-fx-background-radius: 0px;");

        StackPane root = new StackPane(button);

        Scene scene = new Scene(root, 800, 500);

        stage.setTitle("EMD");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}