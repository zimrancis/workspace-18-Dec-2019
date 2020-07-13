package application;

import java.util.Random;

import javafx.event.ActionEvent;

public class MainController {
	public void generateRandom(ActionEvent e) {
		Random ran = new Random();
		int myrand = ran.nextInt(50) + 1;
		System.out.println(Integer.highestOneBit(myrand));
	}

}
