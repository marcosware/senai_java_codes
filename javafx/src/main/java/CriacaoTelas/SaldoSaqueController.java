package CriacaoTelas;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class SaldoSaqueController {
    @FXML
    private Label balanceText;
    @FXML
    private TextField inputField;
    @FXML
    private Label withdrawText;

    @FXML
    protected void onRunButtonClick() {
        DecimalFormat df = new DecimalFormat("#.00");
        if(inputField.getText().isEmpty()) {
            withdrawText.setText("Insira um valor para sacar!");
        } else {
            double balance = Double.parseDouble(balanceText.getText());
            double withdraw = Double.parseDouble(inputField.getText());
            if(withdraw <= balance) {
                balance -= withdraw;
                withdrawText.setText("Sacou R$" + df.format(withdraw) + " com sucesso.");
                balanceText.setText(String.valueOf(df.format(balance)));
            } else {
                withdrawText.setText("Saldo insuficiente!");
            }
        }
    }
}

