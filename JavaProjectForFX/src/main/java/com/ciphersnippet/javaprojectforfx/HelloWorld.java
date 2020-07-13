package com.ciphersnippet.javaprojectforfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) throws Exception {

		Button greeting = new Button("Hi World!");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> {
			System.out.println("Good by!");
			System.exit(0);
		});
		greeting.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event2) {
				System.out.println("Hi World!");

			}
		});

		VBox root = new VBox();
		//root.getChildren().add(greeting);
		root.getChildren().addAll(greeting, exit);

		Scene scene = new Scene(root, 600, 400);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Hi!");
		primaryStage.show();

	}

}
