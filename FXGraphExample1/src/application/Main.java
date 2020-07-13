package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Load the FXML File
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("BorderPaneExample.fxml"));
			// Create the Scene
			Scene scene = new Scene(root, 400, 400);
			// Add the StyleSheet to the Scene
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// Set the Title to the Stage
			primaryStage.setTitle("A simple FXGraph Example");
			// Add the Scene to the Stage
			primaryStage.setScene(scene);
			// Show the Stage
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}