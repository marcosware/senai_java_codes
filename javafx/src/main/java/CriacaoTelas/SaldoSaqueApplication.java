package CriacaoTelas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class SaldoSaqueApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("saldosaque-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 285, 400);
        stage.setTitle("Saldo e Saque");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch();
    }
}
