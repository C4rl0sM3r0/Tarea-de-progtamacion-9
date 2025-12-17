package com.datasoft.proyectoventas.productos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProductoController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private TableView<Producto> tabla;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, String> colDescripcion;

    private ObservableList<Producto> listaProductos;

    @FXML
    public void initialize() {
        listaProductos = FXCollections.observableArrayList();

        colNombre.setCellValueFactory(data -> data.getValue().nombreProperty());
        colPrecio.setCellValueFactory(data -> data.getValue().precioProperty().asObject());
        colDescripcion.setCellValueFactory(data -> data.getValue().descripcionProperty());

        tabla.setItems(listaProductos);
    }

    @FXML
    public void guardar() {
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            mostrarAlerta("Campos vacíos", "Complete todos los campos obligatorios");
            return;
        }

        try {
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            String descripcion = txtDescripcion.getText();

            Producto producto = new Producto(nombre, precio, descripcion);
            listaProductos.add(producto);

            limpiar();

        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "El precio debe ser un número");
        }
    }

    @FXML
    public void limpiar() {
        txtNombre.clear();
        txtPrecio.clear();
        txtDescripcion.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
