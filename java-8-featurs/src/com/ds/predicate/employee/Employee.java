package com.ds.predicate.employee;

public class Employee {
	String name;
	double experience;
	double salary;

	public Employee() {

		this.name = null;
		this.experience = 0.0;
		this.salary = 0.0;
	}

	public Employee(String name, double experience, double salary) {
		super();
		this.name = name;
		this.experience = experience;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getExperience() {
		return experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
	}

}
