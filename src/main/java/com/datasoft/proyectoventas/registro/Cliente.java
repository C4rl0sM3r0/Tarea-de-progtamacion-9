package com.datasoft.proyectoventas.registro;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cliente {

    private final StringProperty documento;
    private final StringProperty apellidos;
    private final StringProperty nombres;
    private final StringProperty direccion;
    private final StringProperty genero;

    public Cliente(String documento, String apellidos, String nombres, String direccion, String genero) {
        this.documento = new SimpleStringProperty(documento);
        this.apellidos = new SimpleStringProperty(apellidos);
        this.nombres = new SimpleStringProperty(nombres);
        this.direccion = new SimpleStringProperty(direccion);
        this.genero = new SimpleStringProperty(genero);
    }

    public StringProperty documentoProperty() { return documento; }
    public StringProperty apellidosProperty() { return apellidos; }
    public StringProperty nombresProperty() { return nombres; }
    public StringProperty direccionProperty() { return direccion; }
    public StringProperty generoProperty() { return genero; }
}