package com.datasoft.proyectoventas.productos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductoController {

    @FXML private TextField txtNombre, txtPrecio;
    @FXML private TextArea txtDescripcion;

    @FXML private TableView<Producto> tabla;
    @FXML private TableColumn<Producto, String> colNombre, colDescripcion;
    @FXML private TableColumn<Producto, Number> colPrecio;

    private ObservableList<Producto> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colNombre.setCellValueFactory(c -> c.getValue().nombreProperty());
        colPrecio.setCellValueFactory(c -> c.getValue().precioProperty());
        colDescripcion.setCellValueFactory(c -> c.getValue().descripcionProperty());

        tabla.setItems(lista);
    }

    @FXML
    private void guardar() {
        lista.add(new Producto(
                txtNombre.getText(),
                Double.parseDouble(txtPrecio.getText()),
                txtDescripcion.getText()
        ));

        limpiar();
    }

    @FXML
    private void limpiar() {
        txtNombre.clear();
        txtPrecio.clear();
        txtDescripcion.clear();
    }
}