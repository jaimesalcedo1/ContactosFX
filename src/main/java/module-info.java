module com.example.appfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appfxml to javafx.fxml;
    exports com.example.appfxml;
}