package creational.factorypattern.factory.operatingsystem;

import creational.factorypattern.factory.os.OS;
import creational.factorypattern.factory.os.android.Android;
import creational.factorypattern.factory.os.ios.IOS;
import creational.factorypattern.factory.os.windows.Windows;

public class OperatingSytemFactory {

	public OS getInstance(String str) {

		if (str.equals("Open"))
			return new Android();
		else if (str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}
}
