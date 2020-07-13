module com.ciphersnippet.MavenJFXDemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ciphersnippet.MavenJFXDemo to javafx.fxml;
    exports com.ciphersnippet.MavenJFXDemo;
}