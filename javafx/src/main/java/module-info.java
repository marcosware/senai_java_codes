module CriacaoTelas {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens CriacaoTelas to javafx.fxml;
    exports CriacaoTelas;
}