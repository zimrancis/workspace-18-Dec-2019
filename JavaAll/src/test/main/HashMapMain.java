package test.main;

import java.util.HashMap;
import java.util.Map;

import test.employee.Employee;

public class HashMapMain {

	public static void main(String[] args) {
		Employee emp1=new Employee("Martin",27);
		Map<Employee,String> hm=new HashMap<>();
		hm.put(emp1, "Verified");
		emp1.setName("John");
		System.out.println(hm.get(emp1));
		
		/*
		 * System.out.println(); String textCase = "uppercase"; String firstName =
		 * (textCase== "uppercase") ? "zobair" :"ZOBAIR" ;
		 * System.out.println(firstName);
		 * System.out.println(textCase.equals("uppercase") ? "ZOBAIR" : "zobair");
		 */
		
		
		/*
		 * 
		 * Output will be null.
		 * We have implemented Employee’s hashcode and equals method 
		 * using name and age attributes, so when you put emp1 as key in hashmap, 
		 * it will use hashcode and equals method and will be put in HashMap.
		 * After putting emp1 in HashMop, we have changed name of the employee, 
		 * so when you will try to retrieve element from HashMap 
		 * using hm.get(emp1), you won’t be able to get object 
		 * which we have put earlier and it will return null. 
*/
		
	}
}