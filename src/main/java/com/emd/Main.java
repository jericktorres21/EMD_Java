package com.emd;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage mainstage) {
        Application.setUserAgentStylesheet(
                new PrimerLight().getUserAgentStylesheet()
        );

        // LOAD MAIN MENU
        Home_menu hmenu = new Home_menu();
        hmenu.show(mainstage);

        // LOAD MAIN STAGE
        mainstage.setMaximized(true);
        mainstage.show();
    }
}