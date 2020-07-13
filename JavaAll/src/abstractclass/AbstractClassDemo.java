package abstractclass;

class Example1 {
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class Example2 {
	public void display2() {
		System.out.println("display2 method");
	}
}		

abstract class Example31 {
	   abstract void display31();
	   protected abstract void display32();
	   public abstract void display33();
	   public abstract void display34();
	   private int numOne=10;
	   private static int numTwo=20;
	   protected final int numThree=30;
	   public static final int numFour=500;
	   public void display1(){
	      System.out.println("Num1="+numOne+numTwo);
	   }
	   public void display35(){
	     System.out.println("display32 method");
	   }
	}

abstract class Example3 extends Example2 {
	abstract void display3();
}

class Example4 extends Example3 {
	public void display2() {
		System.out.println("Example4-display2 method");
	}

	public void display3() {
		System.out.println("display3 method");
	}
}

class AbstractClassDemo {
	public static void main(String args[]) {
		Example4 obj = new Example4();
		obj.display2();
	}
}