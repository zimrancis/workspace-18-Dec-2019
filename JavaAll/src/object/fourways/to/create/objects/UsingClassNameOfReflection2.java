/**
 * Way 4.2: Reflection – <ClassName>.class.newInstance();

This is very similar to earlier approach with only difference is that, instead of loading class here it expects to know fully qualified class name

Loading –> <ClassName>.class
Creating –> invoking newInstance() method on that particular class
 * */
package object.fourways.to.create.objects;

public class UsingClassNameOfReflection2 {// public no-arg constructor
public UsingClassNameOfReflection2() {
    System.out.println("newInstance() method invokes: "
            + "default no-arg constructor");
}

	public static void main(String[] args) {

		try {
			// Way 4.2: using <ClassName>.class.newInstance();
			@SuppressWarnings("deprecation")
			UsingClassNameOfReflection2 object42 = UsingClassNameOfReflection2.class.newInstance();

			// invoking display() method
			object42.display();
		} catch (InstantiationException iex) {
			iex.printStackTrace();
		} catch (IllegalAccessException iaex) {
			iaex.printStackTrace();
		}
	}

// display() method to test
	public void display() {
		System.out.println("Way 4.2: " + "using <ClassName>.class.newInstance();");
	}
}
/**
 * Output:
	
newInstance() method invokes: default no-arg constructor
Way 4.2: using <ClassName>.class.newInstance();

Explanation:

    We have explicitly provided a default no-arg constructor at line no. 6
    But if we haven’t coded any explicit constructor in the class, then compiler (or JVM) inserts a default no-arg constructor (provided there is no parameterized constructor)
    Line no. 14 creates an Object using newInstance() method after getting fully qualified class name
    When newInstance() method is executed then it invokes public default no-arg constructor
    After object creation step, using object reference we are invoking display() method to print simple message in the console

 * */