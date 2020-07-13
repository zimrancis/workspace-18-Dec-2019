package lambda.object;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		// return "Employee [id=" + id + ", name=" + name + "]";
		return id + ":" + name;
	}

}

public class LambdaForEmployeeObject {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(21154, "FDSDGH"));
		l.add(new Employee(64788, "AYENBM"));
		l.add(new Employee(39898, "EJDOIU"));
		l.add(new Employee(73736, "TKJHED"));
		l.add(new Employee(98237, "QWKKLR"));

		System.out.println(l);

		Collections.sort(l, (o1, o2) -> (o1.getId() < o2.getId()) ? -1 
				: (o1.getId() > o2.getId()) ? 1 : 0);
		System.out.println(l);
		Collections.sort(l, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println(l);
	}

}
