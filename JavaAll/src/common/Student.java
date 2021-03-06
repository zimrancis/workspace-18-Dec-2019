package common;
class Student {
	private long id;
	private String name;
	private double marks;

	public Student() {

 	}

 	public Student(long id, String name, double marks) {
	 		this.id = id;
	 		this.name = name;
	 		this.marks = marks;
 	}

 	public long getId() {
 		return id;
 	}
 	public void setId(long id) {
 		this.id = id;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public double getMarks() {
 		return marks;
 	}
 	public void setMarks(double marks) {
 		this.marks = marks;
 	}
	public String toString() {
		return "Student Id:"+id+"\n"+"Student Name:"+name+"\n"+"Student Marks:"+marks;
	}
}

/*class Student implements Comparable<Student>{
	private long id;
	private String name;
	private double marks;

	public Student() {

 	}

 	public Student(long id, String name, double marks) {
 		this.id = id;
 		this.name = name;
 		this.marks = marks;
 	}

 	public long getId() {
 		return id;
 	}
 	public void setId(long id) {
 		this.id = id;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public double getMarks() {
 		return marks;
 	}
 	public void setMarks(double marks) {
 		this.marks = marks;
 	}
	public String toString() {
		return "Student Id:"+id+"\n"+"Student Name:"+name+"\n"+"Student Marks:"+marks;
	}

	@Override
	public int compareTo(Student student) {
		if(this.getId() > student.getId())
			return 1;
		else
			return -1;
	}
}*/

