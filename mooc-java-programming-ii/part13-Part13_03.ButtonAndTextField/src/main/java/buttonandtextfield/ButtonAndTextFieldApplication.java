package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("ClickMe!");
        TextField textComponent = new TextField();
        
        FlowPane groupComponents = new FlowPane();
        groupComponents.getChildren().add(buttonComponent);
        groupComponents.getChildren().add(textComponent);
        
        Scene view = new Scene(groupComponents);
        
        window.setScene(view);
        window.setTitle("Toto Education");
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }

}
