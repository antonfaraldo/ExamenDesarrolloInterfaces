package org.example.examen2eval_di_afm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.examen2eval_di_afm.dao.UsuarioDAO;
import org.example.examen2eval_di_afm.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML public TextField username;
    @FXML public PasswordField password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
        String username = this.username.getText();
        String password = this.password.getText();
        if (username.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
        } else {
            username = username.trim();
            password = password.trim();
        } if ()
    }

}
