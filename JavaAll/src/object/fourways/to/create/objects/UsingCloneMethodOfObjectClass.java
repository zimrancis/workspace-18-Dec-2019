package object.fourways.to.create.objects;

/**
 * 
 * Way 2: Using clone() method of Object class
 * 
 * clone() method of Object class, creates another copy of the same Object with
 * all its details
 * 
 * Method signature :
 * 
 * protected native Object clone() throws CloneNotSupportedException;
 * 
 */

public class UsingCloneMethodOfObjectClass implements Cloneable {

	public static void main(String[] args) {

		// normal way of creating / instantiating new object
		UsingCloneMethodOfObjectClass obj = new UsingCloneMethodOfObjectClass();

		try {
			// Way 2: using clone() method of Object class
			UsingCloneMethodOfObjectClass obj1 = (UsingCloneMethodOfObjectClass) obj.clone();

			// invoking display() method
			obj1.display();
		} catch (CloneNotSupportedException cnsex) {
			cnsex.printStackTrace();
		}
	}

	// display() method to test
	public void display() {
		System.out.println("display() method is invoked");
	}
}