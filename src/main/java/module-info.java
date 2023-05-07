module com.example.painterapp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.painterapp1 to javafx.fxml;
    exports com.example.painterapp1;
}