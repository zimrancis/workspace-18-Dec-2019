package multipleinheritance;

public interface MainMethodInInterFace {
	
	public static void main(String[] args) {
		System.out.println("Interface main method");
	}
	/*From console we can also directly call "main()" from interface
	 * like: C:/>javac Interf. java
	 *       C:/>java Interf
	 *       or click on "RUN" on Eclipse IDE
	 */
/*
 * To define Generalized utility methods we are no longer required to go 
 * for class to create static methods,
 * happily we can go for static methods() inside ***INTERFACE***
 * But make sure, static methods inside INTERFACE by default 
 * are not available in the implementation classes!  
 */
/* What the need?
 * If everything is static, what the need of going for class?
 * Unnecessary performance is going to be wasted
 * memory is going to be wasted... because you are going for a costly item!!!
 * If you require sweeper only sweeping to sweep your house 
 * you require to recruit sweeper you are not required to recruit IS officer 
 * Recruiting IS officer for sweeping purpose how much stupidness!!
 * If everything is static going for class is also the same stupidness is there.
 * YES any no of static method you can take inside Interface.
 * class is not required!!!
 *  
 * default methods main purpose is without affecting implementation classes
 * we can add new methods to the INTERFACE
 * But variable-wise not differences are there 
 */ 
}
