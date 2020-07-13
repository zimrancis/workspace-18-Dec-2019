package common;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public interface AgainListAndSortingTest {

	public static List<Student> createStudent() {

		return Arrays.asList(new Student(3, "Sara", 80), new Student(9, "Sara", 92), new Student(1, "Bob", 70),
				new Student(2, "Paula", 70), new Student(4, "Paul", 34), new Student(7, "Jack", 94),
				new Student(5, "Jack", 75), new Student(6, "Jill", 40));
	}

	public static void main(String... args) {
		List<Integer> list = new ArrayList<>();
		list.add(524);
		list.add(461);
		list.add(549);
		list.add(611);
		list.add(618);
		list.add(488);
		/*
		 * Comparator<Integer> com = new Comparator<>() { public int compare(Integer o1,
		 * Integer o2) { return o1%10>o2%10?1:-1; } }; Collections.sort(list,com);
		 */

		/* Collections.sort(list,(o1,o2) -> o1%10>o2%10?1:-1); */
		Collections.sort(list, (o1, o2) -> o1 % 10 > o2 % 10 ? 1 : o1 % 10 < o2 % 10 ? -1 : 0); // sorting based on last
																								// 1digit
		// Collections.sort(list,(o1,o2) -> o1%100>o2%100?1:-1);//sorting based on last
		// 2digits

		System.out.println(list);
		System.out.println("\n");

		for (int i : list)
			System.out.println(i);

		System.out.println("\n");
		list.forEach(System.out::println);

		System.out.println("\n");
		Collections.sort(createStudent(), (s1, s2) -> (Long.valueOf(s1.getId()).compareTo(Long.valueOf(s2.getId()))));
		for (Student s1 : createStudent())
			System.out.println(s1);

		Map<String, String> map = new HashMap<>();

		map.put("Advocate", "Shahabuddin");
		map.put("Software Engineer", "Zobair");
		map.put("Barestar", "Omar");
		map.put("Architect", "Sharmin");

		System.out.println("\n* * * * Different Ways of demonstrating data stored inside Map * * * *\n\n");

		System.out.println("\n" + map.keySet());
		System.out.println("\n" + map);

		System.out.print("\n" + map.get("Advocate"));
		if (map.containsKey("Advocate")) {
			/* Object */String value = map.get("Advocate");
			System.out.println(/* "Key : " + */ " Advocate"/* +" value :"+ value */);
		}

		Set<String> set = map.keySet();
		for (String key : set)
			System.out.println("\n" + key);
		for (String key : set)
			System.out.println("\n" + map.get(key));
		for (String key : set)
			System.out.println("\n" + key + " : " + map.get(key));

		Set<Map.Entry<String, String>> values = map.entrySet();
		for (Map.Entry<String, String> e : values) {
			System.out.println("\n" + e.getKey() + " : " + e.getValue());
			e.setValue("III");
		}
	}
}
/*
HashMap                               Hashtable                            LinkedHashMap
1. fast                               slow
2. unsynchronized                     synchronized
3. not thread safe                    thread-safe
4. allow only one null key            does not allow null key
5. insertion oreder is not preserved  insertion oreder is not preserved    preserved
*/