package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField login;
    @FXML
    TextField pass;
    @FXML
    Label label;

    @FXML
    public void enter(ActionEvent event) {
        if (login.getText().equals("admin") && pass.getText().equals("admin")){
            label.setText("Hello Admin!");
        }else {
            label.setText("Ошибка авторизации!");
        }
    }
}
