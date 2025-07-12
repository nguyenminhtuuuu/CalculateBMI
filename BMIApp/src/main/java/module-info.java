module com.nmt.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmt.bmiapp to javafx.fxml;
    exports com.nmt.bmiapp;
}
