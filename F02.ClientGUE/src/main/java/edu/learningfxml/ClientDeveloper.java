package edu.learningfxml;
import com.jbbwebsolutions.http.model.MarginalTax;
import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Map;

public class ClientDeveloper extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Developer Information");

        String sURL = "http://localhost:9215/developer";
        Map g = URLUtility.get(sURL, Map.class);
        System.out.println(g);

        Label label=new Label(g.toString());
        Scene scene=new Scene(label, 488, 200);
        stage.setScene(scene);
        stage.show();

    }
}
