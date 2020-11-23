package com.pseudo.login.it;

import com.jbbwebsolutions.http.model.MarginalTax;
import com.jbbwebsolutions.http.utility.URLUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.HashMap;
import java.util.Map;

public class LoginController {


    @FXML
    private Text txtStatus;

    @FXML
    private TextField txtUserID;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnSignIn;

    @FXML
    void signinAction(ActionEvent event) {

        String sURL = "http://localhost:9216/login";
         Map<String,Object>map=new HashMap<>();
         map.put("uid",txtUserID.getText());
         map.put("pwd",pwdPassword.getText());
       Object o= URLUtility.post(sURL,map, 3);

    txtStatus.setText("Welcome To Our Application "+o);
    }
    @FXML
    void ClearAction(ActionEvent event){
        txtUserID.clear();
        pwdPassword.clear();
        txtStatus.setText("");
    }

}
