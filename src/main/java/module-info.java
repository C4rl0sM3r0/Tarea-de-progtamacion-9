module com.datasoft.proyectoventas {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;

    opens com.datasoft.proyectoventas.menu to javafx.fxml;
    opens com.datasoft.proyectoventas.productos to javafx.fxml;
    opens com.datasoft.proyectoventas.registro to javafx.fxml;

    exports com.datasoft.proyectoventas;
}