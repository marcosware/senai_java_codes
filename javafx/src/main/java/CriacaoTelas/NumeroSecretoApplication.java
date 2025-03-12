package CriacaoTelas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NumeroSecretoApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("numerosecreto-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 240, 400);
        stage.setTitle("Número Secreto");
        stage.setScene(scene);
        stage.show();
    }
}
