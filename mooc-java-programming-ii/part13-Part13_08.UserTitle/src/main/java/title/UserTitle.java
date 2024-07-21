package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    private static String windowTitle;

    public static void setWindowTitle(String title) {
        windowTitle = title;
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the stage
        primaryStage.setTitle(windowTitle);
        
        // Set the width and height of the stage
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        
        // Show the stage
        primaryStage.show();
    }
}

