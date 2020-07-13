package lambda.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
	
	/*
	 * public static int SquareIt(int n) {
	 * 
	 * return n*n;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * System.out.println("The Square of 4: "+FunctionTest.SquareIt(4));
	 * System.out.println("The Square of 5: "+FunctionTest.SquareIt(5));
	 * 
	 * }
	 */
	@FunctionalInterface //optional coz' if single abs m() than it is absolutely a FI
	interface FuncIntf {
		public void m1();
		default void m2() {
			
		}
		
		public static void m3() {
			
		}
	}
	
	@FunctionalInterface //optional
	interface FuncIntf2 extends FuncIntf {
		public void m1(); //optional
	}
	
	interface FuncIntf3 extends FuncIntf {
		public void m2(); 
	}
	
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The Square of 40: "+f.apply(40));
		System.out.println("The Square of 50: "+f.apply(50));
		
		//to check if the given number is even or not
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));		

	}
}
/*
 * Java 8 New Features:
--------------------
concise code
Enabling Functional Programming

1. Lambda Expressions [in 1930 Lambda calculus came in the mathematics world
                       LISP was the 1st PL using it] It is an anonymous function
                       without name, return type and modifiers!
                       The main objective of LE bing used is to bring the 
                       benefits of Functional programming with concise code!
                       
//     (int n) -> {return n*n; }
//	   (int n) -> n*n;		
//	    n -> n*n;
 * 
 * FI= Functional Interface ==> SAM [Single Abstract Method]
 * Runable ==> run()
 * Comparable ==> compareTo()
 * Comparator ==> compare()
 * Calable ==> call()
 * 
 * But Functional Interface should contain only one abstract method, but 
 * any number of default methods and static methods as well
 * 
 * 
		
	
2. Functional Interface
2. Default Methods and static methods
2. Predefined Functional Interfaces
   Predicate
   Function
   Consumer
   Supplier
   etc
2. Double Colon Operator (::) 
   Method reference
   Constructor reference
2. Streams
2. Date and Time API
2. Optional class 
2. Nashron JavaScript Engine
etc
 */
