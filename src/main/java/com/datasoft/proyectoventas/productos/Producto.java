package com.datasoft.proyectoventas.productos;

import javafx.beans.property.*;

public class Producto {

    private final StringProperty nombre;
    private final DoubleProperty precio;
    private final StringProperty descripcion;

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = new SimpleStringProperty(nombre);
        this.precio = new SimpleDoubleProperty(precio);
        this.descripcion = new SimpleStringProperty(descripcion);
    }

    public StringProperty nombreProperty() { return nombre; }
    public DoubleProperty precioProperty() { return precio; }
    public StringProperty descripcionProperty() { return descripcion; }
}