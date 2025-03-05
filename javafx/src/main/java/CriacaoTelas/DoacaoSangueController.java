package CriacaoTelas;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DoacaoSangueController {
    @FXML
    private Label resultText;
    @FXML
    private ImageView resultImage;
    @FXML
    private TextField ageInput;
    @FXML
    private TextField weightInput;

    @FXML
    protected void onRunButtonClick() {
        if(ageInput.getText().isEmpty() || weightInput.getText().isEmpty()) {
            resultText.setText("Digite uma idade/peso!");
        }
        else{
            int age = Integer.parseInt(ageInput.getText());
            double weight = Double.parseDouble(weightInput.getText());
            if((age >= 18 && age <= 65 && weight >= 50)) {
                resultText.setText("Apto para doar!");
                resultImage.setImage(new Image(getClass().getResourceAsStream("imgs/blood.png")));
            } else {
                resultText.setText("Não apto para doar!");
                resultImage.setImage(new Image(getClass().getResourceAsStream("imgs/noblood.png")));
            }
        }
    }
}
