package CriacaoTelas;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

import java.util.Random;

public class NumeroSecretoController {
    @FXML
    private TextField inputField;
    @FXML
    private Label guessText;
    @FXML
    private Label drawnText;
    @FXML
    private Label resultText;

    @FXML
    protected void onRunButtonClick() {
        Random rand = new Random();
        int drawn = rand.nextInt(6);
        if(inputField.getText().isEmpty()) {
            resultText.setText("Digite um número!");
        }
        else{
            int num = Integer.parseInt(inputField.getText());
            drawnText.setText(String.valueOf(drawn));
            guessText.setText(String.valueOf(num));
            if(num == drawn) {
                resultText.setText("Acertou!");
                resultText.setTextFill(Paint.valueOf("#01F534"));
            } else {
                resultText.setText("Errou!");
                resultText.setTextFill(Paint.valueOf("#F50033"));
            }
        }
    }
}
