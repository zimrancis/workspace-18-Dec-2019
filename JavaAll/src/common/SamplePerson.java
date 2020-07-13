package common;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class SamplePerson {
	public static List<Person> createPeole() {
		return Arrays.asList(
			new Person("Sara", Gender.FEMALE, 20),
			new Person("Sara", Gender.FEMALE, 22),
			new Person("Bob", Gender.MALE, 20),
			new Person("Paula", Gender.FEMALE, 32),
			new Person("Paul", Gender.MALE, 32),
			new Person("Jack", Gender.MALE, 2),
			new Person("Jack", Gender.MALE, 72),
			new Person("Jill", Gender.FEMALE, 12)
			);
	}

	public static void main(String... args) {
		//imperative style: tell what to do and how to do it

		//name of thge first person older than 30
/*		String name = null;
		for(Person person: createPeole()) {
			if(person.getAge() > 30) {
				name = person.getName();
				break; //if I dont put a break
				//in the best case I get a slow resoponse
				//in the worse case I get a wrong response!
				//in both ways we are in trouble!
			}
		}
			if(name != null) {
				System.out.println(name);
			} else {
				System.out.println("Name not found!");
			}
*/
//*****************************************************************//
	 	System.out.println(
		createPeole().stream()
	 		.filter(p -> p.getAge() > 30)
	 		.map(Person::getName)
	 		.collect(Collectors.toList()));

			       // collect.forEach(System.out::println);


/*
 Thread t = new Thread() {
	 ... // here t class extending an anonymous class
	 i.e.; creating a child class of which 'new Thread()' is an object
 };

 Runnable r = new Runnable() {
 	 ... // here I am creating child class or implementation class for the Runable
 	 for that implementation class I am creating an object which is: 'new Runnable()'
 };

 So Anonymous inner class can extend a class or can implement an interface.

 interface A {
	 m1();
	 m2();
 }

 A a = new A() {
	 public void  m1() {

	 }

	 public void  m2() {

	 }
};
*/
	 		Runnable r = () -> {
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread!");
				}

			};

			Thread t = new Thread(r);
			t.start();
}
}