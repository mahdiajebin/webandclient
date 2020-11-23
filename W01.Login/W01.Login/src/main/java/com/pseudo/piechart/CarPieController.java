package com.pseudo.piechart;

import com.google.gson.reflect.TypeToken;
import com.jbbwebsolutions.http.utility.URLUtility;
import com.pseudo.login.it.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class CarPieController implements Initializable {

    @FXML
    private VBox vbox;

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL purl, ResourceBundle resourceBundle) {

        Type listOfProducts = new TypeToken< List<Product>>() {}.getType();

        String url = "http://localhost:9215/expensivecars";
        List<Product> products = URLUtility.get(url, listOfProducts);

        products.forEach( e -> {
            PieChart.Data slice = new PieChart.Data(e.getName(), e.getPrice());
            pieChart.getData().add(slice);
        });

    }
}
