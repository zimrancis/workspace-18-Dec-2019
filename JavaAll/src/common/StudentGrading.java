package common;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;

class StudentGrading {

	public static void main(String... args) {

	 Function<Student,String> f = s ->  {
		 double marks = s.getMarks();
		 String grade = "";
		if(marks>=80) grade="A[Distinction]";
		else if(marks>=60) grade="B[FirstClass]";
		else if(marks>=50) grade="C[Second Class]";
		else if(marks>=35) grade="D[Third Class]";
		else  grade="E[Faild]";
		return grade;
	  };

	  Predicate<Student> p=s->s.getMarks()>44 && s.getMarks()<66;
	  Consumer<Student> c=s1 -> {
		  System.out.println(s1);
		  System.out.println("Student Grade:"+f.apply(s1));
		  System.out.println();
	  };

	  Student[] s={ new Student(3, "Zobair", 100),
		  			new Student(2, "Sunny", 65),
		  			new Student(1, "Bunny", 55),
		  			new Student(9, "Chinny", 45),
		  			new Student(4, "Vinny", 25)
	  };


	 /* Comparator<Student> com = new Comparator<>() {

		  public int compare(Student s1,Student s2) {
			  if(s1.getMarks()>s2.getMarks())
			  	return 1;
			  else
			  	return -1;
		  }

	  };*/  /*****************[OR]*****************/

	  /*Comparator<Student> com = (s1,s2) ->{
	  			  if(s1.getMarks()>s2.getMarks())
	  			  	return 1;
	  			  else
	  			  	return -1;

	  };*/

	   //Arrays.sort(s);
	   //Arrays.sort(s, com);
//Arrays.sort(s,(s1,s2)->(s1.getMarks()<s2.getMarks())?-1:(s1.getMarks()>s2.getMarks())?1:0);

//Arrays.sort(s,(s1,s2)->(s1.getName().compareTo(s2.getName())));
Arrays.sort(s,(s1,s2)->(Long.valueOf(s1.getId()).compareTo(Long.valueOf(s2.getId()))));

	  for(Student s1: s) {

		  if(p.test(s1)) {
			  c.accept(s1);
		  }

	  }
  }
}