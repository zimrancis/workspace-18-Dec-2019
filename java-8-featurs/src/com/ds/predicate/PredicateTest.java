package com.ds.predicate;

//import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> ip = I -> I>10; 
		System.out.println(ip.test(15));//true
		System.out.println(ip.test(5));//false
		
		Predicate<String> sp = s -> s.length()>3;
		System.out.println(sp.test("zobair"));//true
		System.out.println(sp.test("zaa"));//false
		
		/*Predicate<Collection> cp = c -> c.isEmpty();

		System.out.println(sp.test(al-ArrayList));//true
		System.out.println(sp.test(ll-LinkList));//false*/
	}

}
