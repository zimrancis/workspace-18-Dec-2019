package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Execution {

	public static void main(String[] args) {

		Student s = new Student("H234");
		Student s2 = new Student("H234");
		System.out.println(s.equals(s2));

		Map<Student, ReportCard> studentReport = new HashMap<>();
		studentReport.put(s, new ReportCard());
		studentReport.put(s2, new ReportCard());

		System.out.println(studentReport.size());
		
		Set<Student> studentSet = new HashSet<>();
		for(int i=0; i<100; i++) {
			studentSet.add(new Student("H"+i));
		}
		
		System.out.println(studentSet.size());
		
		long startTime = System.nanoTime();
		System.out.println(studentSet.contains(new Student("H4")));
		System.out.println("Elapsed Time:"+(System.nanoTime()-startTime));
		
		Student s3 = new Student("H234");
		System.out.println(s.equals(s));
		System.out.println(s.equals(s2)+"---"+s2.equals(s));
		System.out.println(s.equals(s2)+"---"+s2.equals(s3)+"---"+s.equals(s3));
		System.out.println(s.equals(null));
	}
}






//Collection<Student> l = new ArrayList<>();
//l.add(s1); l.addAll(l);
// !!!Object[] o = l.toArray();
//l.remove(s1);
//l.removeAll(l);
//l.clear();
//l.retainAll(l);
//boolean bl= l.contains(s1);
//boolean bl2= l.containsAll(l);
//boolean bl3= l.isEmpty();
//l.size();
//Set<Student> s = new TreeSet<>();
//Queue<Student> q = new PriorityQueue<>(); 
