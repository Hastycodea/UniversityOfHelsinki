package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane allComponents = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 27500, 2500);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setLegendVisible(false);

        Label monthlySavings = new Label("Monthly savings");

        Slider slider = new Slider();
        slider.setMin(25);
        slider.setMax(250);
        slider.setValue(25);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(25);
        Label savings = new Label(String.valueOf(slider.getValue()));

        XYChart.Series data = new XYChart.Series();

        //initializing data with default values
        for (int i = 0; i <= 30; i++) {
            data.getData().add(new XYChart.Data(i, slider.getValue() * i));
        }

        slider.valueProperty().addListener((obs, oldValue, newValue) -> {
            double save = newValue.doubleValue();

            savings.setText(String.format("%.1f", newValue.doubleValue()));

            data.getData().clear();
            for (int i = 0; i <= 30; i++) {
                int year = i;
                double value = (save * year * 12);
                data.getData().add(new XYChart.Data(year, value));
            }
        });

        lineChart.getData().add(data);

        BorderPane savingsControl = new BorderPane();
        savingsControl.setLeft(monthlySavings);
        savingsControl.setRight(savings);
        savingsControl.setCenter(slider);

        Label interestRate = new Label("Yearly interest rate");

        Slider slider2 = new Slider();
        slider2.setMin(0);
        slider2.setMax(10);
        slider2.setValue(0);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(true);
        Label interest = new Label(String.valueOf(slider2.getValue()));

        XYChart.Series data2 = new XYChart.Series();

        //initializing data with default values
        for (int i = 0; i <= 30; i++) {
            data2.getData().add(new XYChart.Data<>(i, slider.getValue() * i * 12));
        }

        slider2.valueProperty().addListener((obs, oldValue, newValue) -> {
            double interestSavings = newValue.doubleValue();
            interest.setText(String.format("%.1f", newValue.doubleValue()));

            data2.getData().clear();
            double annualSavings = slider.getValue() * 12;
            double total = 0;
            for (int i = 0; i <= 30; i++) {
                if (i > 0) {
                    total += annualSavings;
                    total += annualSavings * (interestSavings / 100);
                }
                data2.getData().add(new XYChart.Data<>(i, total));
            }
        });

        lineChart.getData().add(data2);

        BorderPane interestControl = new BorderPane();
        interestControl.setLeft(interestRate);
        interestControl.setRight(interest);
        interestControl.setCenter(slider2);

        VBox regulate = new VBox();
        regulate.getChildren().setAll(savingsControl, interestControl);
        regulate.setPadding(new Insets(10));

        // adding all Components building blocks
        allComponents.setCenter(lineChart);
        allComponents.setTop(regulate);

        // display
        Scene view = new Scene(allComponents, 640, 480);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}
