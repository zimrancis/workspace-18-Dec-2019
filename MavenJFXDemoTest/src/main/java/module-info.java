module withsenebuilder {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens withsenebuilder to javafx.fxml;
    exports withsenebuilder;
}