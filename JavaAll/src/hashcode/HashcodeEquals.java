package hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student {

	private int id;

	private String name;

	public Student(int id, String name) {

		this.name = name;

		this.id = id;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

}

public class HashcodeEquals {

	public static void main(String[] args) {

		Student alex1 = new Student(1, "Alex");

		Student alex2 = new Student(1, "Alex");

		System.out.println("alex1 hashcode = " + alex1.hashCode());

		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checki" + "" + "ng equality between alex1 and alex2 = " 
		+ alex1.equals(alex2));

		Student alex = new Student(1, "Alex");
		List<Student> studentsLst = new ArrayList<>();

		studentsLst.add(alex);

		System.out.println("Arraylist size = " + studentsLst.size());
		System.out.println("Arraylist contains Alex = " 
		+ studentsLst.contains(new Student(1, "Alex")));
		// ????? why FALSE ?????

		HashSet<Student> students = new HashSet<Student>();

		students.add(alex1);

		students.add(alex2);

		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " 
		+ students.contains(new Student(1, "Alex")));

	}

}