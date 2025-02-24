package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ConversorTempController {
    @FXML
    private Label resultText;
    @FXML
    private TextField inputField;
    @FXML
    private RadioButton fahrenheit;
    @FXML
    private RadioButton kelvin;
    @FXML
    private ToggleGroup radio;

    @FXML
    protected void onRunButtonClick() {
        if(inputField.getText().isEmpty()) {
            resultText.setText("Digite uma temperatura!");
        }
        else{
            int celsius = Integer.parseInt(inputField.getText());
            double temperature;
            if(radio.getSelectedToggle() == null) {
                resultText.setText("Selecione uma conversão!");
            }
            else if(radio.getSelectedToggle().equals(fahrenheit)) {
                temperature = (celsius * 1.8) + 32;
                resultText.setText("Conversão: " + temperature + " ºF");
            }
            else if (radio.getSelectedToggle().equals(kelvin)) {
                temperature =  celsius + 273.15;
                resultText.setText("Conversão: " + temperature + " K");
            }
        }
    }
}
