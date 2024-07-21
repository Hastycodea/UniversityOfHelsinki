package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;


public class BorderPaneApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane elements = new BorderPane();
        elements.setTop(new Label("NORTH"));
        elements.setRight(new Label("EAST"));
        elements.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(elements);
        window.setScene(view);
        window.show();
        
    }


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
    }

}
