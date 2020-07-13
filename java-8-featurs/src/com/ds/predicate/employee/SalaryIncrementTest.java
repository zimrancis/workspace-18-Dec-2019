package com.ds.predicate.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SalaryIncrementTest {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setName("Zobair");
		emp.setSalary(10000);
		emp.setExperience(3.5);			
		list.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setName("Omar");
		emp1.setSalary(50000);
		emp1.setExperience(2.5);
		list.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setName("Imtiaz");
		emp2.setSalary(10000);
		emp2.setExperience(1.5);			
		list.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setName("Shilpi");
		emp3.setSalary(40000);
		emp3.setExperience(3.5);			
		list.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setName("Sharmin");
		emp4.setSalary(21000);
		emp4.setExperience(4.5);			
		list.add(emp4);
		
		Employee emp5= new Employee();
		emp5.setName("Mamun");
		emp5.setSalary(22000);
		emp5.setExperience(2.5);			
		list.add(emp5);
		
		for(Employee e: list) {
			System.out.println(e);
		}
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Sunny", 5.7,5000));
		al.add(new Employee("Bunny", 1.2,6000));
		al.add(new Employee("Chinny", 4.2,9000));
		al.add(new Employee("Vinny", 1,20000));
		
		System.out.println(al);
		
		Predicate<Employee> p = e -> e.salary<10000 && e.experience>3.5;  
		
		for(Employee e : al) {
			if(p.test(e)) {
				e.salary+=2000;
			}
		}
		System.out.println(al);

	}

}