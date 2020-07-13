package primitive.functional.interfaces.intconsumer;

import java.util.function.IntPredicate;

public class IntPredicateTest {

	public static void main(String[] args) {

		int array[] = {0,10,15,20,25,30,35,40};
		
		IntPredicate ip = i-> i%2==0; // no autoboxing is performed
		
		for(int a : array) {
			if(ip.test(a))
				System.out.println(a);
		}		
	}
}
