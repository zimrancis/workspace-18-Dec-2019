package withsenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class HelloWorld2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scen = new Scene(root);
		primaryStage.setTitle("My title");
		primaryStage.setScene(scen);
		primaryStage.show();

	}

}
