package creational.factorypattern.factory.os.windows;

import creational.factorypattern.factory.os.OS;

public class Windows implements OS {

	@Override
	public void spec() {
		System.out.println("I'm about to die...");

	}

}
