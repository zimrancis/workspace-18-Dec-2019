package primitive.functional.interfaces.binaryperator;

import java.util.function.IntBinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		//BinaryOperator<String> b= (s1, s2)->s1+s2;
		//System.out.println(b.apply("Cipher" , "snippet"));
		IntBinaryOperator b= (i1, i2)->i1*i2;
		System.out.println(b.applyAsInt(10,20));
	}

}
