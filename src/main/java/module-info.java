module com.system.inventorycontrolsystemjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports com.system.project;
    opens com.system.project to javafx.fxml;
    exports com.system.project.controller.mainFX;
    opens com.system.project.controller.mainFX to javafx.fxml;
}