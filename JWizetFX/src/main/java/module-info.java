module com.ciphersnippet.JWizetFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ciphersnippet.JWizetFX to javafx.fxml;
    exports com.ciphersnippet.JWizetFX;
}