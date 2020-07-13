module App {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.ciphersnippet.javaprojectforfx to javafx.fxml;
    exports com.ciphersnippet.javaprojectforfx;
}