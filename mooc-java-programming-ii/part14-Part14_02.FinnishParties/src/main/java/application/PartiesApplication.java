package application;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
    
    @Override
    public void start(Stage window){
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative Support %");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative Support of the Parties");
        
        Map<String, XYChart.Series<Number, Number>> seriesMap = new HashMap<>();
        
        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            String[] years = scanner.nextLine().split("\t");
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                
                String party = parts[0];
                XYChart.Series<Number, Number> series = new XYChart.Series<>();
                series.setName(party); 
                
                for (int i = 1; i < parts.length; i++) {
                    int year = Integer.parseInt(years[i]);
                    String supportString = parts[i];
                    if (supportString.equals("-")) {
                        supportString = String.valueOf(0);
                    }
                    double support = Double.parseDouble(supportString); 
                    
                    series.getData().add(new XYChart.Data(year, support));
                }
                seriesMap.put(party, series);
                
            }
            
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // adding series to the chart
        
        for(XYChart.Series<Number, Number> series : seriesMap.values()) {
            lineChart.getData().add(series);
        }
        
        Scene view = new Scene(lineChart, 640, 480);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

}
