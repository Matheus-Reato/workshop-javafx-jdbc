module com.curso.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.curso.workshopjavafxjdbc to javafx.fxml;
    exports com.curso.workshopjavafxjdbc;
    exports com.curso.workshopjavafxjdbc.model.entities;
}