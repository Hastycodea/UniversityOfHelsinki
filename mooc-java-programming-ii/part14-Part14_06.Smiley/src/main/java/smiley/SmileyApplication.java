package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane components = new BorderPane();

        Canvas canvas = new Canvas(640, 480);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        gc.setFill(Color.BLACK);
        gc.fillOval(20, 20, 30, 30);

        components.setCenter(canvas);

        Scene view = new Scene(components);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}
