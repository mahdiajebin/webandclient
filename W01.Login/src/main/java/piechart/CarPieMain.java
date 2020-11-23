package piechart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CarPieMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader
                .load(getClass()
                        .getResource("CarPieChartView.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Login Screen: Peter Parker");
        stage.setScene(scene);
        stage.show();
    }
}
