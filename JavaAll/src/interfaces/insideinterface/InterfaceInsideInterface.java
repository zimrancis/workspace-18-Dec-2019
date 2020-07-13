
/****
 * Why use Java interface?
 * 
 * There are mainly three reasons to use interface. They are given below.
 * 
 * It is used to achieve abstraction.
 * By interface, we can support the functionality of multiple inheritance.
 * It can be used to achieve loose coupling.

 * */
package interfaces.insideinterface;

import interfaces.insideinterface.Drawable.MessagePrintable;

/**
 * Q) What is marker or tagged interface? An interface which has no member is
 * known as a marker or tagged interface, for example, Serializable, Cloneable,
 * Remote, etc. They are used to provide some essential information to the JVM
 * so that JVM may perform some useful operation.
 */

//How Serializable interface is written?  
interface Serializable {

}

interface Drawable {
	void draw();

	static int squareRoot(int x) {
		return (int) Math.sqrt(x);
	}

	/**
	 * Nested Interface in Java Note: An interface can have another interface which
	 * is known as a nested interface.
	 */
	interface MessagePrintable {
		void msg();
	}

}

class OtherTasks implements MessagePrintable {
	public void draw() {
		System.out.println("drawing rectangle");
	}

	@Override
	public void msg() {
		System.out.println("It's simply a message from OtherTasks.Class ");

	}
}

class Rectangle implements Drawable, MessagePrintable {
	public void draw() {
		System.out.println("drawing rectangle");
	}

	@Override
	public void msg() {
		System.out.println("It's simply a message from Rectangle.Class ");

	}
}

class InterfaceInsideInterface {
	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.squareRoot(9));
		
		MessagePrintable m=()-> System.out.println("Imlemented from 'Smain()' by LambdaExression");
		m.msg();
	}
}
