package common;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;


class Employee {
	private int eid;
	private String ename;
	private int esalary;

	public Employee(int eid, String ename, int esalary) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}

	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}

	public void setEsalary(double esalary) {
		this.ename=ename;
	}
	public double getEsalary() {
		return esalary;
	}

	public String toString() {
		return eid+":"+ename+":"+esalary;
	}

	public Employee findUsingEnhancedForLoop(String name, List<Employee> employees) {

	    for (Employee employee : employees) {
	        if (employee.getEname().equals(name)) {
	            return employee;
	        }
	    }
	    return null;
	}

	public Employee findUsingStreamAPI(String name, List<Employee> employees) {
		Employee imran = employees.stream().filter(employee -> name.equals(employee.getEname()))
	                 			  .findFirst().orElse(null);
		return imran;
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee(001,"Imran",50000);
		System.out.println(e);
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(212,"Sunny",40000));
		l.add(new Employee(111,"Bunny",55000));
		l.add(new Employee(434,"Chinny",35000));
		l.add(new Employee(424,"Vinny",40000));
		l.add(new Employee(303,"Pinny",45000));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.getEid()<e2.getEid())?-1:(e1.getEid()>e2.getEid())?1:0);
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.getEname().compareTo(e2.getEname())));
		System.out.println(l);
		System.out.println(e.findUsingEnhancedForLoop("Sunny", l));
		System.out.println(e.findUsingStreamAPI("Bunny", l));
		Collections.sort(l,(e1,e2)->(e1.getEsalary()<e2.getEsalary())?-1:(e1.getEsalary()>e2.getEsalary())?1:0);
		System.out.println("Ascending:\n"+l);
		Collections.sort(l,(e1,e2)-> -(Double.valueOf(e1.getEsalary()).compareTo(Double.valueOf(e2.getEsalary()))));
		System.out.println("Descending:\n"+l);
		System.out.println("Second Largest:"+l.get(1));

		System.out.println("Salary < 45000 and > 35000 belongs to: "
		+l.stream().filter(p -> p.getEsalary() > 35000 && p.getEsalary() < 45000).map(Employee::getEname)
			 		                    .collect(Collectors.toList()));
		    		                    //collect.forEach(System.out::println);
	}
}