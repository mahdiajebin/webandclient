package com.pseudo.login.it;

import com.jbbwebsolutions.http.model.MarginalTax;
import com.jbbwebsolutions.http.utility.JSONPost;
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
    private TextField txtUserId;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private Button btnSignIn;

    @FXML
    private Text txtStatus;

    @FXML
    private Button btnClear;

    @FXML
    void signInAction(ActionEvent event) {

        // check to see if valid password





        String sURL = "http://localhost:9216/login";
        Map<String,Object> map = new HashMap<>();

        /*
            JSON example
            {"uid": "parker",
            "pwd": "pwd1234"}
         */

        map.put("uid",txtUserId.getText());
        map.put("pwd",pwdPassword.getText());

        Object o = URLUtility.post(sURL, map, 3);

        txtStatus.setText("Welcome to our Application " + o);
    }

    @FXML
    void clearAction(ActionEvent event) {
        txtUserId.clear();
        pwdPassword.clear();
        txtStatus.setText("");
    }

}