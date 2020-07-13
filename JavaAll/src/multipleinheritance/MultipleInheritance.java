package multipleinheritance;

interface  Interf{
	public static void m1() {
		System.out.println("Interface static m1()");
	}
}

interface Left {
	default void m1() {
		System.out.println("Left m1");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right m1");
	}
}

class Left_Right implements Left, Right {

	@Override
	public void m1() { //default turns into public here because it's a term of Switch
		System.out.println("From my own m1");
		Left.super.m1();
		Right.super.m1();		
	}
	
}

public class MultipleInheritance {// implements Interf { [NOT REQUIRED]
	public static void main(String[] args) {
		
		Left_Right lr = new Left_Right();
		lr.m1();
		
		Interf.m1(); //1 OK
		/*
		 * m1(); //2 NOT OK
		 * MultipleInheritance.m1();//3 NOT OK 
		 * MultipleInheritance m = new MultipleInheritance(); 
		 * m.m1();//4 NOT OK
		 */
		
		/*From console we can also directly call "main()" from interface
		 * like: C:/>javac Interf. java
		 *       C:/>java Interf 
		 *       check MainMethodInInterFace program in the current package
		 */
	}
	

}
