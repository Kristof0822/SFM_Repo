package hu.inf.unideb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLStudentsSceneController {
    @FXML
    private Label birthDayLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label helloLabel;

    @FXML
    private Label HelloLbl;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonPushed(ActionEvent event) {

    }

    @FXML
    void handleButtonPushed(){
        System.out.println("Hello world!!!");
        if (helloLabel.getText().equals("fekete")) helloLabel.setText("fehér");
        else helloLabel.setText("fekete");
    }
    @FXML
    void HandleButtonPushed(){
        System.out.println("Masik gomb");
        HelloLbl.setText("Fehér");
    }
}
