package textstatistics;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class TextStatisticsApplication extends Application{
    
    @Override
    public void start(Stage window){
        BorderPane elements = new BorderPane();
        
        elements.setCenter(new TextArea(""));
        
        HBox textComponents = new HBox();
        
        textComponents.setSpacing(10);
        
        textComponents.getChildren().add(new Label("Letters: 0"));
        textComponents.getChildren().add(new Label("Words: 0"));
        textComponents.getChildren().add(new Label("The longest word is:"));
        
        elements.setBottom(textComponents);
        
        Scene view = new Scene(elements);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
