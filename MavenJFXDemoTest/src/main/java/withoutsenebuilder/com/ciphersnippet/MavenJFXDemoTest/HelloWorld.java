package withoutsenebuilder.com.ciphersnippet.MavenJFXDemoTest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class HelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click me");
		Button exit = new Button("Exit");
		// exit.setOnAction(e -> System.exit(0));
		exit.setOnAction(e -> {
			System.out.println("Exit the App...");
			System.exit(0);
		});

		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World");

			}
		});

		// StackPane root = new StackPane();
		// root.getChildren().add(btn);

		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);
		Scene scen = new Scene(root, 500, 300);
		primaryStage.setTitle("My title");
		primaryStage.setScene(scen);
		primaryStage.show();

	}

}
