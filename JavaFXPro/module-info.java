module application {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ciphersnippet to javafx.fxml;
    exports com.ciphersnippet;
}