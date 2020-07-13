package predefined.functional.interfaces.function;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f= i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		
		Function<String, Integer> f1= s->s.length();
		System.out.println(f1.apply("Ciphersnippet"));
		
		Function<String, String> f2= s1->s1.toUpperCase();
		System.out.println(f2.apply("Ciphersnippet Technology"));

	}

}

/*
 *The interface which doesnt contain any methods are called Marker Interfaces
 * And by implementing that interface if our object will get some
 * extra ability extra functionality such type of interfaces are Marker.
 * 
 * @FunctionalInterface 
 *Functional Interfaces are:[if curly braces are used return must be declared]
 *****{eturn n*n;};*****  
 *Runnable  :contains only 1 method [SAM]
 *Callable  :contains only 1 method [SAM]
 *Comarable :contains only 1 method [SAM] 
 *
 *Marker Interfaces are
 *Serializable
 *RandomAccess
 *Cloneable
 *SingleThreadModel
 *  
 *  
 *  
 *  Normal To Level class====>We are going to use multiple times
 *  Annonymous Inner class===> if the requirement is only once
 * */
