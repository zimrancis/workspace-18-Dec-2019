package predefined.functional.interfaces.consumer;

import java.util.function.Consumer;

class Movie {
	private String name;
	
	public Movie(String name) {
		this.name=name;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}	
}
public class ConsumerTest2 {
	public static void main(String[] args) {
		Consumer<Movie> c1 = m-> System.out.println(m.getName()+ " ready to release");
		Consumer<Movie> c2 = m-> System.out.println(m.getName()+ " released but it is bigger flop!!!");
		Consumer<Movie> c3 = m-> System.out.println(m.getName()+ " storing information in database");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Spider");
		c3.accept(m);  	        
		System.out.println("\n");
		cc.accept(m);
	
	}
}
/* Predicate, Function, Consumer, Supplier
 * -----------------------------
 *
Predicate takes some input and Perform some conditional check and returns boolean
value-->Predicate ==> test()

Function takes some input and Perform some operation and returns the result which is need not be
boolean type-->Function ==> apply()

Consumer accepts some input and perform required operation and not required to return
anything--> Consumer. ==> accept()
Even for consumer Chaining is also possible! 

Just supply my required objects and it won't take any input-->Supplier ==> get()
 */
