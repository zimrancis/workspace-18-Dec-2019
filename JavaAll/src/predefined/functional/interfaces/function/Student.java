package predefined.functional.interfaces.function;

public class Student {
	private String name;
	private int marks;

	public Student() {

	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getMarks() {
		return marks;
	}

	public final void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}

