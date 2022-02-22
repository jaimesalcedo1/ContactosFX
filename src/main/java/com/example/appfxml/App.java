package com.example.appfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Locale locale = new Locale("es_ES");
        ResourceBundle bundle= ResourceBundle.getBundle("i18n.menu",locale);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("main-view.fxml"), bundle);
        Scene scene = new Scene(fxmlLoader.load(), 650, 350);
        stage.setTitle("ContactosFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}