module com.example.bank_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bank_management to javafx.fxml;
    exports com.example.bank_management;
}