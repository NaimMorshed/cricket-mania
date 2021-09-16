module com.example.cricketmania {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cricketmania to javafx.fxml;
    exports com.example.cricketmania;
}