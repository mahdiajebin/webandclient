package com.pseudo.login.it;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PieChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        String url = "http://localhost:9216/expensivecars";

        Type listType = new TypeToken<List<Product>>() {}.getType();
        List<Product> wsProducts = URLUtility.get(url,  listType);
        System.out.println(wsProducts);
        primaryStage.setTitle("boulet, jean " + new Date()     );
        PieChart pieChart = new PieChart();

        Product[] products = {
                new Product("RangeRover", 92_000f)
                ,new Product("Lexus", 82_000f)
                ,new Product("BMW", 90_000f)
                ,new Product("Mercedez", 88_000f)
        };

        for (Product p : wsProducts){
            PieChart.Data slice1 = new PieChart.Data(p.getName(), p.getPrice());
            pieChart.getData().add(slice1);
        }

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 550  , 550);

        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}