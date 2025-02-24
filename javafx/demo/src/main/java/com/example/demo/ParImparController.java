package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ParImparController {
    @FXML
    private Label resultText;
    @FXML
    private TextField inputField;

    @FXML
    protected void onRunButtonClick() {
        if(Integer.parseInt(inputField.getText()) % 2 == 0) {
            resultText.setText("O número é par");
        }
        else {
            resultText.setText("O número é ímpar");
        }
    }
}