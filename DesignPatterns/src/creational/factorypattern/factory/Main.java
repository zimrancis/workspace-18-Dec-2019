package creational.factorypattern.factory;

import creational.factorypattern.factory.operatingsystem.OperatingSytemFactory;
import creational.factorypattern.factory.os.OS;

public class Main {

	public static void main(String[] args) {
		
		OperatingSytemFactory osf = new OperatingSytemFactory();
		OS obj = osf.getInstance("lakdjf");
		obj.spec();
		
	}

}
