package map.hashmap;

import java.util.HashMap;


public class HashMapDemo {
	
	public static void main(String[] args) {
		// Create a Map of words and their frequency count
		HashMap<String, Integer> mapOfWords = new HashMap<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -8248229087573003921L;

			{
				put("John", 25);
				put("at", 2);
				put("from", 10);
				put("is", 5);
			}
		};
		// Print the map
		System.out.println(mapOfWords);
 
		/*
		 * Updating value of a given in HashMap using put()
		 */
		// Update the value of key "from" to 67, it will return the old value.
		Integer oldValue = mapOfWords.put("from", 67);
 
		System.out.println("Map Contens after change : ");
		// Print the map
		System.out.println(mapOfWords);
		// oldValue returned by put() should be 10.
		assert (oldValue == 10);
 
		// Now try to update a value in HashMap for key that don't even exists in
		// HashMap using put()
		oldValue = mapOfWords.put("frm", 99);
		
		// oldValue returned by put() should be null.
		assert (oldValue == null);
 
		// It will add a new key value Entry in HashMap
		System.out.println(mapOfWords);
		// But if put() returns null, we can not be sure that that it has added a new
		// entry in the map
		// or there was existing key in the map whose value was null.
 
		/*
		 * Updating value of a given in HashMap using replace()
		 */
 
		// Use replace() to avoid unnecessary addition to hashmap while updating value
		// of non existing key in hashmap.
 
		// Update the value of key "from" to 56, it will return the old value.
		oldValue = mapOfWords.replace("from", 56);
 
		assert (oldValue == 67);
 
		System.out.println(mapOfWords);
 
		// Now try to update a value in HashMap for key that don't even exists in
		// HashMap using replace()
 
		oldValue = mapOfWords.replace("frmee", 99);
		
		// It will NOT add the new key value entry in map and returns null.
	
		// oldValue returned by replace() should be null, because key dosn't exists in Map
		assert (oldValue == null);
 
		System.out.println(mapOfWords);
 
		// But if replace() returns null, we can not be sure that that there was no
		// entry in map with given key and it has not updating anything in map
		// or there was existing key in the map whose value was null.
 
		// Use replace() overloaded version to check if updation was successful or not
 
		/*
		 * Updating value of a given in HashMap using overloaded version of replace()
		 * public boolean replace(K key, V oldValue, V newValue)
		 */
 
		// It will update the value of given key to newValue if its old value matches
		// exactly to oldValue.
		
		// update value of frm to 888 from 99. It should return true
		assert (mapOfWords.replace("frm", 99, 888) == true);
		
		System.out.println(mapOfWords);
		
		// update value of frm to 89 from 42. It should return false because
		// old value of frm is not 89.
		assert (mapOfWords.replace("frm", 89, 42) == false);
		
		// update value of frmeee to 89 from 42. It should return false because
		// key 'frmeee' does not exist in map
		assert (mapOfWords.replace("frmeee", 89, 42) == false);
	}
}
