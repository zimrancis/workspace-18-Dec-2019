package common;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

interface StudentGradingSystem {
	public static List<Student> createStudent() {
		return Arrays.asList(
			new Student(3, "Sara", 80),
			new Student(9, "Sara", 92),
			new Student(1, "Bob", 70),
			new Student(2, "Paula", 70),
			new Student(4, "Paul", 34),
			new Student(7, "Jack", 94),
			new Student(5, "Jack", 75),
			new Student(6, "Jill", 40)
		 );
	}

public static void main(String... args) {

	 Function<Student,String> f = s ->  {
		 double marks = s.getMarks();
		 String grade = null;
		if(marks>=80) grade = "A[Distinction]";
		else if(marks>=70) grade = "B[First Class]";
		else if(marks>=60) grade = "C[Second Class]";
		else if(marks>=50) grade = "D[Third Class]";
		else if(marks>=35) grade = "E[Pass]";
		else  grade = "F[Faild]";
		return grade;
	  };

	  Predicate<Student> p = s -> s.getMarks()>60 && s.getMarks()<80;
	  Consumer<Student> c = s -> {
		  System.out.println(s);
		  System.out.println("Student Grade:"+f.apply(s));
		  System.out.println();
	  };

	  for(Student s: createStudent()) {

		  if(p.test(s)) {
			  c.accept(s);
		  }

	  }
  }
}