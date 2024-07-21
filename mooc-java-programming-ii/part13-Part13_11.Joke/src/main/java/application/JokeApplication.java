package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox horizontalElements = new HBox();

        Button buttonShow = new Button("Show");
        Button buttonAnswer = new Button("Answer");
        Button buttonExplain = new Button("Explain");

        horizontalElements.getChildren().addAll(buttonShow, buttonAnswer, buttonExplain);

        layout.setTop(horizontalElements);

        Label text = new Label("What do you call a bear with no teeth?");
        text.setId("Joke"); // Set fx:id for joke label
        Label text2 = new Label("A gummy bear");
        Label text3 = new Label("No teeth just gum, you get it");

        buttonShow.setOnAction(a -> text.setText("What do you call a bear with no teeth?"));
        buttonAnswer.setOnAction(a -> text.setText(text2.getText()));
        buttonExplain.setOnAction(a -> text.setText(text3.getText()));

        layout.setCenter(text);
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
