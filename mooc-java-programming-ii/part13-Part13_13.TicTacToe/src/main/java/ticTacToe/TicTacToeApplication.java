package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class TicTacToeApplication extends Application {

    private boolean xTurn = true;
    private Button[][] buttons = new Button[3][3];
    private Label turnLabel = new Label("Turn: X");

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        // Top layout for turn label
        layout.setTop(turnLabel);

        // Middle layout for buttons grid
        GridPane grid = new GridPane();
        layout.setCenter(grid);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                btn.setMinSize(100, 100);
                int r = row;
                int c = col;
                btn.setOnAction(event -> handleButtonPress(r, c));
                buttons[row][col] = btn;
                grid.add(btn, col, row);
            }
        }

        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }

    private void handleButtonPress(int row, int col) {
        if (!buttons[row][col].getText().equals(" ") || gameEnded()) {
            return;
        }

        buttons[row][col].setText(xTurn ? "X" : "O");
        if (checkWin()) {
            turnLabel.setText("The end!");
        } else {
            xTurn = !xTurn;
            turnLabel.setText("Turn: " + (xTurn ? "X" : "O"));
        }
    }

    private boolean checkWin() {
        // Check rows, columns and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (checkLine(buttons[i][0], buttons[i][1], buttons[i][2]) ||
                checkLine(buttons[0][i], buttons[1][i], buttons[2][i])) {
                return true;
            }
        }
        return checkLine(buttons[0][0], buttons[1][1], buttons[2][2]) ||
               checkLine(buttons[0][2], buttons[1][1], buttons[2][0]);
    }

    private boolean checkLine(Button b1, Button b2, Button b3) {
        return !b1.getText().equals(" ") && b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText());
    }

    private boolean gameEnded() {
        return turnLabel.getText().equals("The end!");
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
