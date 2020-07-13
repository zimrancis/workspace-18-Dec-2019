package common;
import java.util.*;
class CollectionAndCollections {

	public static void main(String args[]) {

		//System.out.println("Your first argument is: " + args[0]);

		List<String> l = new ArrayList<>();
		l.add("Zobair");
		l.add("Jewel");
		l.add("Omar");
		l.add("Omar");
		l.add("Shilpi");
		l.add("Sharmin");
		Collections.sort(l);

		//for(String list: l) {
			System.out.println("LIST: "+l);
		//}

		Set<String> set = new HashSet<>();
				set.add("Zobair");
				set.add("Jewel");
				set.add("Omar");
				set.add("Omar");
				set.add("Shilpi");
				set.add("Sharmin");
			System.out.println("SET: "+set);


		SortedSet<String> sset = new TreeSet<>();
		sset.add("Zobair");
		sset.add("Jewel");
		sset.add("Omar");
		sset.add("Omar");
		sset.add("Shilpi");
		sset.add("Sharmin");
			System.out.println("SortedSET: "+sset);


		/*for(int i=0;i<args.length;i++)
			System.out.println(args[i]);*/

	}
}