package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane elements = new BorderPane();
        TextArea textArea = new TextArea("");
        elements.setCenter(textArea);

        HBox textComponents = new HBox();

        textComponents.setSpacing(10);
        
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int word = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            letters.setText("Letters: " + characters);
            words.setText("Words: " + word);
            longestWord.setText("The longest word is: " + longest);
        });
        textComponents.getChildren().addAll(letters, words, longestWord);

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
