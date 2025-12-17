package com.datasoft.proyectoventas.registro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistroController {

    @FXML private TextField txtDocumento, txtApellidos, txtNombres, txtDireccion;
    @FXML private ComboBox<String> cbGenero;

    @FXML private TableView<Cliente> tabla;
    @FXML private TableColumn<Cliente, String> colDoc, colApe, colNom, colDir, colGen;

    private ObservableList<Cliente> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colDoc.setCellValueFactory(c -> c.getValue().documentoProperty());
        colApe.setCellValueFactory(c -> c.getValue().apellidosProperty());
        colNom.setCellValueFactory(c -> c.getValue().nombresProperty());
        colDir.setCellValueFactory(c -> c.getValue().direccionProperty());
        colGen.setCellValueFactory(c -> c.getValue().generoProperty());

        cbGenero.getItems().addAll("Masculino", "Femenino", "Otro");

        tabla.setItems(lista);
    }

    @FXML
    private void guardar() {
        lista.add(new Cliente(
                txtDocumento.getText(),
                txtApellidos.getText(),
                txtNombres.getText(),
                txtDireccion.getText(),
                cbGenero.getValue()
        ));

        limpiar();
    }

    @FXML
    private void limpiar() {
        txtDocumento.clear();
        txtApellidos.clear();
        txtNombres.clear();
        txtDireccion.clear();
        cbGenero.setValue(null);
    }
}