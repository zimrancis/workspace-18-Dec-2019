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

		 return "[Id: "+id+","+" Name:"+name+","+" Gender:"+gender+","+" Age:"+age+","+" Salary:"+salary+","+" Date:"+ld+"]";
	 }
}

public interface SampleOFJointPredicate {
	public static List<Employee> createPeople() {
			return Arrays.asList(
				new Employee(3565476, "Sara", Gender.FEMALE, 20, 10000, LocalDate.now()),
				new Employee(9857646, "Sara", Gender.FEMALE, 22, 20000, LocalDate.now()),
				new Employee(1324657, "Bob", Gender.MALE, 20, 30000, LocalDate.now()),
				new Employee(2154867, "Paula", Gender.FEMALE, 32, 40000, LocalDate.now()),
				new Employee(1234254, "Paul", Gender.MALE, 32, 50000, LocalDate.now()),
				new Employee(8712384, "Jack", Gender.MALE, 53, 60000, LocalDate.now()),
				new Employee(1634564, "Jack", Gender.MALE, 72, 70000, LocalDate.now()),
				new Employee(6976576, "Jill", Gender.FEMALE, 12, 80000, LocalDate.now())
				);
	}

	public static void main(String... args) {

		 Predicate <Employee> p = e -> e.getGender()==Gender.FEMALE;
		 Predicate <Employee> p2 = e -> e.getSalary() > 30000 && e.getSalary() < 70000;
		 Predicate <Employee> p3 = e -> e.getAge()%2==0;

		 for(Employee e: createPeople()) { // <- this e of Employee under loop

			 if(p.and(p2).test(e)) { // e of Employee under loop
				 System.out.println(e);
				 System.out.println(e.getName()+":"+e.getSalary());

			 }
			 if(p3.negate().test(e)) {
			   System.out.println("[Name:"+e.getName()+" Age:"+e.getAge()+"]");
			 }

			/* if(p.or(p3).test(e)) {
			   System.out.println("[Name:"+e.getName()+" Sex:"+e.getGender()+"]");
			 }*/
		 }

	}
}