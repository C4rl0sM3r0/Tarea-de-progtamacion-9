package com.datasoft.proyectoventas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/com/datasoft/proyectoventas/menu/menu-view.fxml"
                )
        );

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);              // 👈 ESTA LÍNEA FALTABA
        stage.setTitle("Proyecto Ventas");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}