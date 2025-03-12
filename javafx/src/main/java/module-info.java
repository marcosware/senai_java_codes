module JavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    exports CriacaoTelas;
    opens CriacaoTelas to javafx.fxml;
    exports ProgramaEntrega;
    opens ProgramaEntrega to javafx.fxml;
}