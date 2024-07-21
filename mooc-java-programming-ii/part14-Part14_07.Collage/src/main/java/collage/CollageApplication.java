package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // Load the source image
        Image sourceImage = new Image("file:monalisa.png");

        // Get the pixel reader for the source image
        PixelReader imageReader = sourceImage.getPixelReader();

        // Get the original dimensions
        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        // Calculate the new dimensions (one fourth of the original size)
        int newWidth = width / 4;
        int newHeight = height / 4;

        // Create a new writable image to hold the collage
        WritableImage collageImage = new WritableImage(width, height);
        PixelWriter collageWriter = collageImage.getPixelWriter();

        // Create a writable image for the negative smaller image
        WritableImage targetImage = new WritableImage(newWidth, newHeight);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        // Copy the pixels from the original image to the smaller image with negative colors
        for (int y = 0; y < newHeight; y++) {
            for (int x = 0; x < newWidth; x++) {
                // Scale down the coordinates
                Color color = imageReader.getColor(x * 4, y * 4);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);
                imageWriter.setColor(x, y, newColor);
            }
        }

        // Copy the smaller image into the collage at the four positions
        for (int y = 0; y < newHeight; y++) {
            for (int x = 0; x < newWidth; x++) {
                Color color = targetImage.getPixelReader().getColor(x, y);

                // Top-left corner
                collageWriter.setColor(x, y, color);
                // Top-right corner
                collageWriter.setColor(x + newWidth, y, color);
                // Bottom-left corner
                collageWriter.setColor(x, y + newHeight, color);
                // Bottom-right corner
                collageWriter.setColor(x + newWidth, y + newHeight, color);
            }
        }

        // Create an ImageView for the collage image
        ImageView imageView = new ImageView(collageImage);

        // Create a pane and add the ImageView to it
        Pane pane = new Pane();
        pane.getChildren().add(imageView);

        // Set up the stage and show it
        stage.setScene(new Scene(pane, width, height));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
