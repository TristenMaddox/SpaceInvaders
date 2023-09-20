module com.example.spaceinvadersapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spaceinvadersapp to javafx.fxml;
    exports com.example.spaceinvadersapp;
    exports com.example.spaceinvaders;
    opens com.example.spaceinvaders to javafx.fxml;
}