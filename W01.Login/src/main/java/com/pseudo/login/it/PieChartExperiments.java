package com.pseudo.login.it;

import com.google.gson.reflect.TypeToken;
import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class PieChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        String url="http://localhost:9216/expensivecars";

        Type listType =new TypeToken<List<Product>>() {}.getType();

        List<Product> wsProduct =URLUtility.get(url, listType);

        System.out.println(wsProduct);
        primaryStage.setTitle("Sumyia Rahman " + new Date());
        PieChart pieChart = new PieChart();

        Product[] products= {
                new Product("Range Rover", 92_000f)
                , new Product("Lexus", 82_000f)
                , new Product("BMW", 90_000f)
                , new Product("Mercedes", 88_000f)
        };


        for (Product p : wsProduct){
            PieChart.Data slice1 = new PieChart.Data(p.getName(), p.getPrice());
            pieChart.getData().add(slice1);
        }

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}