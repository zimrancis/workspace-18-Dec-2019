package two.argument.predefined.functional.interfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> p1 = (I, J) -> (I+J)%2 == 0;
		System.out.println(p1.test(10,10));
		System.out.println(p1.test(15,10));

		BiPredicate<String, String> s1 = (I,J) -> (I+J).length() > 5;
		System.out.println(s1.test("Zobair","Imran"));
		System.out.println(s1.test("Imr", "an"));
		}
}

/* Predicate, Function, Consumer, Supplier
 * -----------------------------
 * Take some input and Perform some conditional check and returns boolean
value-->Predicate ==> test() 
PREDICATE-JOINING --> and(), negate(), or()
BiPredicate(,)

Take some input and Perform some operation and returns the result which is need not be
boolean type-->Function ==> apply()
Function-Chaining--> andThen() // two function can be combined 
into a single Function to produce a result
BiFunction(,)

Accept some input and perform required operation and not required to return
anything--> Consumer. ==> accept()
Consumer-Even for consumer Chaining is also possible!
-Chaining--> andThen() 
BiConsumer(,) 

Just supply my required objects and it won't take any input-->Supplier ==> get()
 */