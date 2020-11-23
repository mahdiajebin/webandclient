package edu.learningfxml;

import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.image.ImageProducer;
import java.util.Date;
import java.util.Map;

public class GradeController {

    @FXML
    private TextField lblGrade;

    @FXML
    private Button btnCalculate;

    @FXML
    private Label lblMessage;

    @FXML
    void calculateGrade(ActionEvent event) {
   final String url="http://localhost:9215/grade/midsemester/";
   String grade=lblGrade.getText();
        Map g= URLUtility.get(url + grade, Map.class);
        String status=g.get("status").toString();
        lblMessage.setText(status);

    }

}
