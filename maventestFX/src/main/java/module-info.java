module com.ciphersnippet.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ciphersnippet.test to javafx.fxml;
    exports com.ciphersnippet.test;
}