package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane borderElements = new BorderPane();
        Label text1 = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        borderElements.setTop(text1);
        borderElements.setCenter(firstButton);

        VBox verticalElements = new VBox();
        Label text2 = new Label("Second view!");
        Button secondButton = new Button("To the third view!");
        verticalElements.getChildren().addAll(secondButton, text2);

        GridPane gridElements = new GridPane();
        Label text3 = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        GridPane.setConstraints(text3, 0, 0);
        GridPane.setConstraints(thirdButton, 1, 1);
        gridElements.getChildren().addAll(text3, thirdButton);

        Scene view1 = new Scene(borderElements);
        Scene view2 = new Scene(verticalElements);
        Scene view3 = new Scene(gridElements);

        firstButton.setOnAction(event -> {
            window.setScene(view2);
        });
        secondButton.setOnAction(event -> {
            window.setScene(view3);
        });
        thirdButton.setOnAction(event -> {
            window.setScene(view1);
        });

        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);

    }

}
