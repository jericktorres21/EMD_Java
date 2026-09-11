package com.emd;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Acc_cvent {
    public void show(Stage mainstage) {
        // ACC SCENE
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double width = screenBounds.getWidth();
        double height = screenBounds.getHeight();

        VBox buttonscene = new VBox();

        Scene acc_scene = new Scene(buttonscene, width, height);
    }
}