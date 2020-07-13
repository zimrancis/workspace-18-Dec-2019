package com.ds.predicate.employee;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrementTest2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Sunny", 5.7,5000));
		al.add(new Employee("Bunny", 1.2,6000));
		al.add(new Employee("Chinny", 4.2,9000));
		al.add(new Employee("Vinny", 1,20000));
		
		System.out.println(al);
		
		Predicate<Employee> p = e -> e.salary<10000 && e.experience>3.5;  
		Function<Employee, Employee> f = e -> { 
			if(p.test(e)) {
				e.salary+=3000;
			}
			return e;
		};
		
		for(Employee e : al) {
			f.apply(e);
			}
		System.out.println(al);
	}
}