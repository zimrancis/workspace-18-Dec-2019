package primitive.functional.interfaces.unaryoperator;

import java.util.function.IntUnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		//UnaryOperator<Integer> f = i->i*i; //don't go for directly UnaryOperator
//no type-casting, type parameters, autoboxing, orunboxing 
		IntUnaryOperator f = i->i*i;
		//System.out.println(f.apply(6));
		System.out.println(f.applyAsInt(6));
		
	}
}
