module com.example.class_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.class_1 to javafx.fxml;
    exports com.example.class_1;
}