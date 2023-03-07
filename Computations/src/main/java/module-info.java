module com.example.computations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.computations to javafx.fxml;
    exports com.example.computations;
}