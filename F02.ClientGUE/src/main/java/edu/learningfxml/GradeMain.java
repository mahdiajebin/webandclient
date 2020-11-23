package edu.learningfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

public class GradeMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        final String address="C:\\Users\\nycdoe\\IdeaProjects\\F02.ClientGUE\\src\\main\\java\\edu\\learningfxml\\GradeView.fxml";
        final InputStream fxmlStream=new FileInputStream(address);
        Parent root=loader.load(fxmlStream);
        stage.setScene(new Scene(root));
       stage.show();
    }
}
