package common;
import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;


enum Gender {
 MALE, FEMALE, UNKNOWN
};


class Employee {
	private long id;
	private String name;
	private Gender gender;
	private double age;
	private double salary;
	private LocalDate ld;

	public Employee(long id, String name, Gender gender, double age, double salary, LocalDate ld) {
 		this.id = id;
 		this.name = name;
 		this.gender = gender;
 		this.age = age;
 		this.salary = salary;
 		this.ld = ld;
 	}

 	public void setId(long id) {
 		this.id = id;
 	}

 	public long getId() {
 		return id;
 	}

 	public void setName(String name) {
 		this.name = name;
 	 }

 	public String getName() {
 		return name;
 	}

 	public void setGender(Gender gender) {
 		this.gender = gender;
 	}

 	public Gender getGender() {
 		return gender;
 	}

 	public void setAge(double age) {
		this.age = age;
 	}

 	public double getAge() {
	  //System.out.println("getAge for " + name);
 		return age;
 	}

	 public void setSalary(double salary) {
 		 this.salary = salary;
 	 }

 	 public double getSalary() {
 	 	return salary;
 	 }

 	 public LocalDate getLocalDate() {
		return ld;
 	 }

 	 public String toString() {

		 return "[ID: "+id+","+" Name:"+name+","+" Gender:"+gender+","+" Age:"+age+","+" Salary:"+salary+","+" Date:"+ld+"]";
	 }
}

public interface SampleOPredicate {
	public static List<Employee> createPeole() {
			return Arrays.asList(
				new Employee(3565476, "Sara", Gender.FEMALE, 20, 10000, LocalDate.now()),
				new Employee(9857646, "Sara", Gender.FEMALE, 22, 20000, LocalDate.now()),
				new Employee(1324657, "Bob", Gender.MALE, 20, 10000, LocalDate.now()),
				new Employee(2154867, "Paula", Gender.FEMALE, 32, 50000, LocalDate.now()),
				new Employee(1234254, "Paul", Gender.MALE, 32, 50000, LocalDate.now()),
				new Employee(8712384, "Jack", Gender.MALE, 2, 5000, LocalDate.now()),
				new Employee(1634564, "Jack", Gender.MALE, 72, 45000, LocalDate.now()),
				new Employee(6976576, "Jill", Gender.FEMALE, 12, 12000, LocalDate.now())
				);
	}

	public static void main(String... args) {

/*		 Predicate <Integer> p = I -> I%2==0;
		 System.out.println(p.test(10));
	     System.out.println(p.test(15 ));  */

	    // Predicate <Employee> emp = I -> I.getSalary()>45000.00;
	     ArrayList<Employee> emp = null;
		 		for(Employee employee: createPeole()) {
		 			if(employee.getAge() > 30) {
		 				emp.add(employee);
		 				break;
		 			}
		 		}
		 			if(emp != null) {
		 				System.out.println(emp);
		 			} else {
		 				System.out.println("employee not found!");
			}

	}
}