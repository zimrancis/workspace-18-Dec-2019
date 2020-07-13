package behavioural.builderpattern;
//Builder Pattern - Creational Design Pattern

import behavioural.builderpattern.model.Phone;
import behavioural.builderpattern.model.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		//Phone  p = new Phone("Android", 2, "Qualkom", 5.5, 3100);
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(3000).getPhone();
		System.out.println(p);
	}
}
