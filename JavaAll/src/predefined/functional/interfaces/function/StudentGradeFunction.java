package predefined.functional.interfaces.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeFunction {

	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			int marks = s.getMarks();
			String grade = "";

			if (marks >= 80)
				grade = "A[Distinction]";
			else if (marks >= 60)
				grade = "B[First Class]";
			else if (marks >= 50)
				grade = "B[Second Class]";
			else if (marks >= 40)
				grade = "B[Third Class]";
			else
				grade = "B[Failed]";
			return grade;
		};

		Student[] s = { new Student("Zobair", 100), new Student("Sunny", 65), new Student("Bunny", 55),
				new Student("Chinny", 45), new Student("Vinny", 25), };

		for (Student s1 : s) {
			System.out.println("Student Name: " + s1.getName());
			System.out.println("Student Marks: " + s1.getMarks());
			System.out.println("Student Grade: " + f.apply(s1));
			System.out.println("");
		}

		Predicate<Student> p = m -> m.getMarks() >= 60;

		for (Student s1 : s) {
			if (p.test(s1)) {
				System.out.println(s1.toString());
				System.out.println("Student Grade: " + f.apply(s1));
				System.out.println("");
			}
		}

	}
}
