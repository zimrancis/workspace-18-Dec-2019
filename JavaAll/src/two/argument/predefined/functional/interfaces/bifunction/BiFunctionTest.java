package two.argument.predefined.functional.interfaces.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	private int eno;
	private String ename;

	public Employee(int eno, String ename) {

		this.eno = eno;
		this.ename = ename;

	}

	public final int getEno() {
		return eno;
	}

	public final void setEno(int eno) {
		this.eno = eno;
	}

	public final String getEname() {
		return ename;
	}

	public final void setEname(String ename) {
		this.ename = ename;
	}
}

public class BiFunctionTest {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		BiFunction<Integer, String, Employee> bf = (eno, ename) -> new Employee(eno, ename);
		l.add(bf.apply(101, "Zobair"));
		l.add(bf.apply(102, "Omar"));
		l.add(bf.apply(103, "Jewel"));
		l.add(bf.apply(104, "Mamun"));
		l.add(bf.apply(105, "Imran"));
		
		for(Employee e :l) {
			System.out.println("Employee Number: "+ e.getEno());
			System.out.println("Employee Name: "+ e.getEname());
			System.out.println();
		}
	}
}
