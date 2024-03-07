module williamcsc325.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens williamcsc325.colorchooser to javafx.fxml;
    exports williamcsc325.colorchooser;
}