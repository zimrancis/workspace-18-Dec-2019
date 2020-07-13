package constructorreference;

class Student {
	String name;
	int rollno;
	int marks;
	int age;

	public Student(String name, int rollno, int marks, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}

}

interface Interf3 {
	public Student get(String name, int rollno, int marks, int age);	
}

/*
 * [1] class Demo implements Interf3 {
 * 
 * 
 * @Override public Student get(String name, int rollno, int marks, int age) {
 * 
 * Student s = new Student(name, rollno, marks, age);
 * 
 * return s; }
 * 
 */

public class Test {

	public static void main(String[] args) {
		// [2] Interf3 i = (n,r,m,a) -> new Student(n, r, m, a);
		Interf3 i2 = Student::new;
		/* Student s = */ i2.get("Zobair", 101, 1000, 42);
	}

}