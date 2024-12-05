package com.example.entreprise;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private LineChart<String, Number> Linechart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private PieChart piechart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("1", 23));
        series.getData().add(new XYChart.Data<>("2", 30));
        series.getData().add(new XYChart.Data<>("3", 203));
        series.getData().add(new XYChart.Data<>("4", 70));
        series.getData().add(new XYChart.Data<>("5", 2));
        series.getData().add(new XYChart.Data<>("6", 14));
        series.getData().add(new XYChart.Data<>("7", 19));

        // Ajouter la série au graphique
        Linechart.getData().add(series);

        XYChart.Series series2 = new XYChart.Series();
        series2.getData().add(new XYChart.Data("1", 123));
        series2.getData().add(new XYChart.Data("2", 13));
        series2.getData().add(new XYChart.Data("3", 3));
        series2.getData().add(new XYChart.Data("4", 200));
        series2.getData().add(new XYChart.Data("5", 21));
        series2.getData().add(new XYChart.Data("6", 141));
        series2.getData().add(new XYChart.Data("7", 191));
        Linechart.getData().addAll(series2);

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                new PieChart.Data("GRH",    132),
                new PieChart.Data("DVI",    132),
                new PieChart.Data("SSD",    453),
                new PieChart.Data("CS",    32));
        piechart.setData(pieChartData);

    }
}