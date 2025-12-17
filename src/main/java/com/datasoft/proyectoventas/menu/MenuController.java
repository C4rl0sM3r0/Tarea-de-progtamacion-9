package com.datasoft.proyectoventas.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    private void cambiarVentana(String fxml, ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(fxml)
            );

            Scene scene = new Scene(loader.load(), 900, 600);
            stage.setScene(scene);
            stage.setResizable(true);
            stage.show();

        } catch (Exception e) {
            System.err.println("Error al cargar: " + fxml);
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
                "/com/datasoft/proyectoventas/productos/productos-view.fxml",
                event
        );
    }

    public void salir() {
        System.exit(0);
    }
}
