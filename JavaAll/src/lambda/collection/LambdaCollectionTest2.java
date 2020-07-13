package lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCollectionTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(25);
		l.add(30);
		
		System.out.println(l);
		/*
		 * Comparator<Integer> c = (o1, o2) -> (o1<o2)?-1:(o1>o2)?1:0;
		 * Collections.sort(l, c);
		 */
		Collections.sort(l, (o1, o2) -> (o1<o2)?-1:(o1>o2)?1:0);
		System.out.println(l);
		//to see one-by-one one-by-one
		l.stream().forEach(System.out::println);
		//to check whether even number is there
		List<Integer> l2 = l.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(l2);

	}

}
