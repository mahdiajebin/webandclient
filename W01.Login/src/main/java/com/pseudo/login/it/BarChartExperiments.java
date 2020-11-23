package com.pseudo.login.it;
import com.google.gson.reflect.TypeToken;
import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BarChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Type carSalesList = new TypeToken <List<DataModel>>() {}.getType();

        String sURL = "http://localhost:9416/design/monthlysales";

      //  List<?>  o = URLUtility.get(sURL, List.class);

        List<DataModel> dataFromWebService = URLUtility.get(sURL, carSalesList);

        System.out.println(dataFromWebService);
        primaryStage.setTitle("BarChart Experiments");

        CategoryAxis xAxis    = new CategoryAxis();
        xAxis.setLabel("month");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("value");

        BarChart  barChart = new BarChart(xAxis, yAxis);


         dataFromWebService.forEach( e -> {
            XYChart.Series<String, Number> dataseries1 = new XYChart.Series<>();
            dataseries1.getData().add(new XYChart.Data("1", e.getValue()));
            dataseries1.setName(e.getMonth());
            barChart.getData().addAll(dataseries1);
        });

//
        VBox vbox = new VBox(barChart);
        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(1200);

        primaryStage.show();



    }

    public static void main(String[] args) {Application.launch(args);

    }


}