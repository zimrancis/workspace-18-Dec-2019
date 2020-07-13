package map;

import java.util.HashMap;
import java.util.Iterator;
 
public class IterateMapMain {
 
	public static void main(String args[])
	{
		
		// HashMap with Country as key and capital as value
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("India","Delhi");
		map.put("Japan","Tokyo");
		map.put("France","Paris");
		map.put("Russia","Moscow");
 		// Iterating java iterator
		System.out.println("Iterating java Iterator");
		Iterator<String> countryKeySetIterator=map.keySet().iterator();
		while(countryKeySetIterator.hasNext()){
			String countryKey=countryKeySetIterator.next();
			map.put("Nepal", "KathMandu");
			System.out.println(countryKey); 
		}
		System.out.println("-----------------------------");
	} 
}
/*
 * You will get below output
 * Iterating java IteratorException in thread “main” java.util.ConcurrentModificationException
 * at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1489)
 * at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1512)
 * at org.arpit.java2blog.IterateMapMain.main(IterateMapMain.java:24)Japan
 * Whenever you try to change count of hashmap while iterating,
 * it will throw java.util.ConcurrentModificationException because
 * we call iterator.next,it checks for modCount and initial count,
 * if it does not match it will throw ConcurrentModificationException. * 
 * 
 */