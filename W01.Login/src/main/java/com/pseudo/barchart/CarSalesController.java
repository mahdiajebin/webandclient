package com.pseudo.barchart;

import com.google.gson.reflect.TypeToken;
import com.jbbwebsolutions.http.utility.URLUtility;
import com.pseudo.login.it.DataModel;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.layout.VBox;

import java.lang.reflect.Type;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.chart.BarChart;

import javafx.scene.chart.XYChart;


public class CarSalesController implements Initializable {


    @FXML
    private VBox vbox;

  @FXML
    private BarChart<String, Number> barChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Type carSalesList = new TypeToken <List<DataModel>>() {}.getType();

      // String sURL = "http://localhost:9416/design/monthlysales";

       String sURL = "http://localhost:9416/db/monthlysales";

        List<DataModel> data = URLUtility.get(sURL, carSalesList);

        data.forEach( e -> {
            XYChart.Series<String, Number> dataseries1 = new XYChart.Series<>();
            dataseries1.getData().add(new XYChart.Data("1", e.getValue()));
            dataseries1.setName(e.getMonth());
            barChart.getData().addAll(dataseries1);
        });

    }


}


/*
 */