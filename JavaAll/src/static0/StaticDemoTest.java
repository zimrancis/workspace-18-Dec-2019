package static0;

class StaticDemo {
	int instancevariable; // Instance variable
	static final String staticvariable = "Static"; // Static variable
	static int inc = 0;

	public void m1() { // Instance method
		String s = "Instance";
		System.out.println(inc++ + ". " + s + " " + "Mehod");
	}

	public static void m2() { // Static method
		System.out.println(inc + ". " + staticvariable + " " + "Mehod");
	}

	{ // Instance block
		String s = "Instance";
		System.out.println(inc++ + ". " + s + " " + "Block");
	}

	static { // Static block
		System.out.println(inc++ + ". " + staticvariable + " " + "Block");
	}

	StaticDemo() { // Default constructor
		String s = "Default";
		System.out.println(inc++ + ". " + s + " " + "Constructor");
	}

	StaticDemo(String s, int i) { // User defined constructor
		instancevariable = i;
		System.out.println(inc++ + ". " + instancevariable + " " + s + " " + "Constructor");
	}
}

public class StaticDemoTest {
	public static void main(String[] args) {
		// 0. Static block is executed;
		StaticDemo sd1 = new StaticDemo();// 1. Instance block is executed;
		// 2. Default constructor is executed;
		new StaticDemo("User defined", 1);// 3. Instance block is executed;
		// 4. User defined constructor is executed;
		sd1.m1();// 5. Instance method is executed;
		StaticDemo.m2();// 6. Static method is executed;

	}
}
