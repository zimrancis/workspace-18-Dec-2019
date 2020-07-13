package common;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person1 {
	private String firstName;
	private String lastName;

	public Person1() {

	}

	public Person1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		//return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
		return firstName + " " + lastName;
	}

}

public class JavaMain {

	// Person p = new Person();
	public static void main(String[] args) {

		List<Person1> person = new ArrayList<>();
		person.add(new Person1("Zobair", "Imran"));
		person.add(new Person1("air", "ran"));
		person.add(new Person1("oba", "mr"));
		person.add(new Person1("Zai", "ma"));
		person.add(new Person1("ir", "Im"));

		for (Person1 l : person) {
			System.out.println(l.getFirstName() + " " + l.getLastName());
		}
		System.out.println("");

		Iterator<Person1> iterator = person.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("");

		Iterator<Person1> itr = person.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}

		System.out.println("");

		person.forEach(l -> System.out.println(l.getFirstName() + " " + l.getLastName()));

	}

}
