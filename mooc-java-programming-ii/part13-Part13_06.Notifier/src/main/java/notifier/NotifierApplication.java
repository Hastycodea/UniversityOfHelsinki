package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        TextField textArea = new TextField();
        Label labelText = new Label();
        Button button = new Button("Update");
        
        button.setOnAction((event) -> {
            labelText.setText(textArea.getText()); 
        });
        
        VBox components = new VBox();
        components.getChildren().setAll(textArea, button, labelText);
        
        Scene view = new Scene(components);
        
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
