package application;

import java.util.EventObject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private Label result;
	private boolean start = true;
	private EventObject event;

	@FXML
	public void processNumber(ActionEvent e) {
		if(start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
	}
	
	@FXML
	public void processOperator(ActionEvent e) {

	}
}
