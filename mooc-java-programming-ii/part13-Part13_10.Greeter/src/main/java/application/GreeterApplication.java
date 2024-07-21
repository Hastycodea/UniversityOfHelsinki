package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        GridPane gridElement = new GridPane();

        Label text = new Label("Enter your name and start.");
        TextField details = new TextField("");
        Button button = new Button("Start");
        Label errorMessage = new Label("");

        gridElement.add(text, 0, 0);
        gridElement.add(details, 0, 1);
        gridElement.add(button, 0, 2);
        gridElement.add(errorMessage, 0, 3);

        gridElement.setPrefSize(300, 180);
        gridElement.setAlignment(Pos.CENTER);
        gridElement.setVgap(10);
        gridElement.setHgap(10);
        gridElement.setPadding(new Insets(20, 20, 20, 20));

        BorderPane borderElement = new BorderPane();
        borderElement.setPrefSize(300, 180);

        Scene view1 = new Scene(gridElement);
        Scene view2 = new Scene(borderElement);

        button.setOnAction(a -> {
            if (details.getText().isEmpty()) {
                errorMessage.setText("Name is EMPTY");
                return;
            }
            borderElement.setCenter(new Label("Welcome " + details.getText() + "!"));
            window.setScene(view2);

        });

        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
