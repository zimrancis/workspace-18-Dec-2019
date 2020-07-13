package predefined.functional.interfaces.function;

import java.util.function.Function;

public class FunctionChainingTest {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i*2;
		Function<Integer, Integer> f2 = i -> i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		
		System.out.println(f1.andThen(f2).andThen(f1).apply(10));

	}
}
/*
 * Predicate<T>  ---> boolean test()
 * [check conditions]
 * Function<T,R> ---> R type  apply()
 * [do some operations and return ]
 * Consumer<T,R> ---> void    accept()
 * [store in database or print data not return anything]
 * 
 */