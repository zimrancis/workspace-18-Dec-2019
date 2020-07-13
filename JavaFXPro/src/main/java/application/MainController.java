package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label message;
	public void generateRandom(@SuppressWarnings("exports") ActionEvent e) {
		Random ran = new Random();
		int myrand = ran.nextInt(50) + 1;
		message.setText(Integer.toString(myrand)); 
		//System.out.println(Integer.toString(myrand));
	}

}
