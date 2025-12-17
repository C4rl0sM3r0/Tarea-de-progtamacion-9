package com.datasoft.proyectoventas.menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MenuController {

    private void cambiarVentana(String fxml, ActionEvent event) {
        try {
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource())
                    .getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(fxml)
            );

            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void abrirClientes(ActionEvent event) {
        cambiarVentana(
                "/com/datasoft/proyectoventas/registro/registro-view.fxml",
                event
        );
    }

    public void abrirProductos(ActionEvent event) {
        cambiarVentana(
                "/com/datasoft/proyectoventas/productos/producto-view.fxml",
                event
        );
    }

    public void salir() {
        System.exit(0);
    }
}