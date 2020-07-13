package com.ds.predicate.joining.and;

import java.util.function.Predicate;

public class PredicateAndTest {

	public static void main(String[] args) {

		int[] x ={0, 5, 10, 15, 20, 25, 25, 30};
		
		Predicate<Integer> p1 = I->I>10;
		Predicate<Integer> p2 = I->I%2==0;
		
		System.out.println("The numbers greater than 10:");
		m1(p1, x);
		System.out.println("The even numbers:");
		m1(p2, x);
		System.out.println("The numbers greater than 10 and even:");
		m1(p1.and(p2), x);

	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		
		for(Integer X1 : x) {
			if(p.test(X1)) {
				System.out.println(X1);
			}
		}
	}

}
