package lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lambda.enume.Gender;
import lambda.model.Person;

public class FunctionalProgramming {

	public static List<Person> createPeople() {

		return Arrays.asList(
				new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26),
				new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32),
				new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23),
				new Person("David", "Green", "david@gmail.com", Gender.MALE, 39),
				new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26),
				new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33),
				new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27),
				new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30),
				new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22),
				new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));
	}

	public static void main(String[] args) {
		List<Person> listPersons = new ArrayList<>();
		 
		listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
		listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
		listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
		listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
		listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
		listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
		listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));
		
		// imperative style of programming: tell what to do and how to do it as well

		// Find the name of the first person who is older than 30

		String name = null;

		for (Person person : createPeople()) {
			if (person.getAge() > 30) {
				name = person.getFirstName(); //Bob
				break;
			}

		}

		if (name != null)
			System.out.println(name);
		else
			System.out.println("name is not found");
		
		System.out.println(listPersons);
		List<Person> age = listPersons.stream()
				.filter(i -> i.getAge()%2==0)
				.collect(Collectors.toList());
				System.out.println("Even Aged Men: "+age);
		//[Alice Brown, Bob Young, Eric Young, Henry Baker, Isabell Hill, Jane Smith]
		
		List<Integer> updatedage = listPersons.stream()
				.map(i -> i.getAge()+5)
				.collect(Collectors.toList());
				System.out.println(updatedage);
		//[31, 37, 28, 44, 31, 38, 32, 35, 27, 29]
				
		
		List<Person> belowThirtyMen = listPersons.stream()
				.filter(a->a.getAge()<30)
				.collect(Collectors.toList());
		System.out.println("Persons having ages below 30 are: "+belowThirtyMen);
		
		List<Integer> belowThirtyInAge = listPersons.stream()
				.filter(a->a.getAge()<30)
				.sorted()
				.map(a -> a.getAge())
				.collect(Collectors.toList());
		System.out.println("List of ages under 30 are: "+belowThirtyInAge);
		
		
		long underThirty = listPersons.stream()
				.filter(a->a.getAge() < 30)
				.count();
		System.out.println("Total persons under 30 are: "+underThirty);
		
		List<Person> sortedList = listPersons.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted list is: "+sortedList);

		/*
		 * Default Natural Sorting Order is implemented by using Comparable Interface
		 * Comparable interface contains compareTo() method,
		 * so if we do not pass any argument in sorted() method,
		 * by default internally compareTo() method is going to work
		 * that is (i1, i2) ==> (i1).compareTo(i2) means Ascending order
		 */
		
		List<Integer> sortedListOfAges = listPersons.stream()
				.sorted()
				.map(a -> a.getAge())
				.collect(Collectors.toList());
		System.out.println("Sorted list is: "+sortedListOfAges);
		
		//OR SAME OCCURS IF WE CALL compareTo() method INSIDE sorted() method
		
		List<Integer> sortedListOfAges2 = listPersons.stream()
				.sorted((i1, i2) -> i1.compareTo(i2))
				.map(a -> a.getAge())
				.collect(Collectors.toList());
		System.out.println("Sorted list with compareTo() is: "+sortedListOfAges2);
		
		// NOW IF I WANT DESCENDING ORDER VALUES FROM HERE AS REVERS
		
		List<Integer> sortedListOfAges3 = listPersons.stream()
				.sorted((i1, i2) -> -i1.compareTo(i2))
				.map(a -> a.getAge())
				.collect(Collectors.toList());
		System.out.println("Sorted list with compareTo() \n"
				+ "as revers or descending order is: "+sortedListOfAges3);
		
		//OR SAME 
		List<Integer> sortedListOfAges4 = listPersons.stream()
				.sorted((i1, i2) -> i2.compareTo(i1))
				.map(a -> a.getAge())
				.collect(Collectors.toList());
		System.out.println("Sorted list by passing \n"
				+ "reversed values in compareTo() is: "+sortedListOfAges4);
		
		/*Comparator -- compare(obj1, obj2)
		 * returns -ve iff (if&onlyif) obj1 has to come before obj2
		 * returns +ve iff (if&onlyif) obj1 has to come after obj2
		 * returns 0 iff (if&onlyif) obj1 & obj2 are equal
		 * 
		 *  in Descending order {10, 20}
		 *  bigger value should come first...
		 *  smaller value should come last...
		 *  [20, 10]
		 *  
		 *  here, sorted() ==> according to default natural sorting order
		 *  and sorted(Comparator) ==> Customized sorting
		 *  
		 */		
		List<Integer> customSort = listPersons.stream()
				.map(a -> a.getAge())
				.sorted((i1, i2)->(i1 < i2)?1 :(i1 > i2)?-1 :0)
				.collect(Collectors.toList());
		System.out.println("Custom or Descending ordered Sorted list is: "+customSort);
		
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		l.add("AAA");
		l.add("AAAAA");
		l.add("XXX");
		l.add("AAAA");
		l.add("AA");
		l.add("AAA");
		System.out.println(l);		
		Comparator<String> c = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return 1;
			else return s1.compareTo(s2);			
		};
		
		List<String> sortedList1 = l.stream()
				.sorted(c)
				.collect(Collectors.toList());
				System.out.println("Sorted list1 is: "+sortedList1);
				
				
			/*
			 * Min  & Max
			 * Before getting min or max value min or max must be sorted,
			 * if we don't pass any argument as comparator no sorting will occur
			 * not even default natural sorting will take place
			 * min does not mean to be the smallest value
			 * max does not mean to be the biggest value
			 * rather min means according to sorting the first value
			 * whereas max mean the last value
			 * so as per sorting if 0 is placed in the last, 0 is max value.  
			 *  	
			 */
				
				ArrayList<Integer> l2 = new ArrayList<>();
				l2.add(10);
				l2.add(0);
				l2.add(15);
				l2.add(5);
				l2.add(20);
				System.out.println(l2);		

				Integer min = l2.stream().min((i1, i2)-> -i1.compareTo(i2)).get();
				System.out.println("min value is :"+min);		
				Integer max = l2.stream().max((i1, i2)-> -i1.compareTo(i2)).get();
				System.out.println("max value is :"+max);
				
				
				// To print the values of list
				
//				for(Integer i1: l2) {
//					System.out.println(i1);	
//				}

				//INSTEAD OF APPLYING OR RUNNING LOOP
				
				l2.stream().forEach(System.out::println);
				
				//************* LIKE *************
//				Consumer<Integer> cons = i -> {
//					System.out.println("The Square of "+i+ "is: " +i*i);
//				};
//				l2.stream().forEach(cons);
				
				/*
				 * But we need not use Consumer we can do directle the below one:
				 * 
				 */
				l2.stream().forEach(i -> {
					System.out.println("The Square of "+i+ "is: " +(i*i));
				});
				
				//toArray() is used to convert stream of objects into array
				/*
				 * what is the need of converting into array?
				 * Array performance-wise too good when compared with Collections concept
				 * so, once the data is stabilized we're not going to add or remove
				 * any more elements, the highly recommended we should go for
				 * Array concept!  
				 *   
				 */
				Integer[] i3 = l2.stream().toArray(Integer[]::new);
				
				for(Integer i4: i3) {
					System.out.println(i4);
				}
				// now again Integer array to stream() to be converted
				System.out.println(" ");				
				Stream.of(i3).forEach(System.out::println);
				
				/*
				 * Wherever group of elments/values are there or arrays are there not only 
				 * for Collections, stream() concept is required
				 */
				
				Stream<Integer> s = Stream.of(9,99,999,9999,99999);
				s.forEach(System.out::println);
				
				Integer[] i6 = {10,20,30,40,50};
				Stream.of(i6).forEach(System.out::println);
	}		
	
}