module com.example.task04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task04 to javafx.fxml;
    exports com.example.task04;
}