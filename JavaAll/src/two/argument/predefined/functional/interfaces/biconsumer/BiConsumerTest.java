package two.argument.predefined.functional.interfaces.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {

		this.name = name;
		this.salary = salary;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;

	}

	public final double getSalary() {
		return salary;
	}

	public final void setSalary(double salary) {
		this.salary = salary;
	}
}

public class BiConsumerTest {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);
		BiConsumer<Employee, Double> c = (e,d)->e.setSalary(e.getSalary() + d);

		for (Employee e : l) {
			c.accept(e, 500.0);
		}

		for (Employee e : l) {
			System.out.println("Employee Name: " + e.getName());
			System.out.println("Employee Salary: " + e.getSalary());
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Zobair", 1000));
		l.add(new Employee("Omar", 2000));
		l.add(new Employee("Jewel", 3000));
		l.add(new Employee("Mamun", 4000));
		l.add(new Employee("Imran", 5000));

	}
}
