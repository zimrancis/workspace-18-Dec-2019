package predefined.functional.interfaces.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeFunctionRevised {

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

		Predicate<Student> p = m -> m.getMarks() >= 60;
		Consumer<Student> c = s0 -> {
			System.out.println(s0.toString());
			System.out.println("S_Grade: " + f.apply(s0));
			System.out.println("");
		};
		
		for (Student s1 : s) {
			if (p.test(s1)) { //to see all record ignore "if (p.test(s1))"
				c.accept(s1);
			}
		}

	}
}
/* Predicate, Function, Consumer, Supplier
 * -----------------------------
 * Take some input and Perform some conditional check and returns boolean
value-->Predicate

Take some input and Perform some operation and returns the result which is need not be
boolean type-->Function

Accept some input and perform required operation and not required to return
anything--> Consumer.
Even for consumer Chaining is possible! 

Just supply my required objects and it won't take any input-->Supplier
 */
