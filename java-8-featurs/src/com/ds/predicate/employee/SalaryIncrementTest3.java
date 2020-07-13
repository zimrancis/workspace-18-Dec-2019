package com.ds.predicate.employee;

import java.util.ArrayList;
import java.util.function.Function;

public class SalaryIncrementTest3 {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Sunny", 5.7,5000));
		al.add(new Employee("Bunny", 1.2,6000));
		al.add(new Employee("Chinny", 4.2,9000));
		al.add(new Employee("Vinny", 1,20000));
		
		System.out.println("1st");
		al.forEach(System.out::println);
		
		System.out.println("\n2nd");
		System.out.println(al);
		
		Function<ArrayList<Employee>, Double> f = l -> {
			double total = 0;
			
			for(Employee e : l) {
				total+=e.salary;
			}
		    return total; 
		};
		    System.out.println("The total salary: " + f.apply(al));
		    al.add(new Employee("Pinny", 2, 15000));
		    System.out.println("3rd");
			al.forEach(System.out::println);
		    System.out.println("The total salary: " + f.apply(al));
	}
}