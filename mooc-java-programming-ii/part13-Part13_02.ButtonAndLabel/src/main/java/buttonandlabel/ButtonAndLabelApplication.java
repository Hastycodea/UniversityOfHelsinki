package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("Click me!");
        Label labelComponent = new Label("I'm just a text");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(labelComponent);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.setTitle("My first application");
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
        System.out.println("Hello world!");
    }

   
}
