package com.Map.Implementation;

import java.util.Hashtable;
import java.util.Map;

public class HashTableImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declare and instantiate a HashTable,
		//synced, thread safe , no null keys/value at all 
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		ht.put(1,"Kevin");
		ht.put(4,"Dojo");
		ht.put(2,"Charlie");
		ht.put(3,"Tim");
		
		
		//can't add null to hashtables
//		ht.put(null,null); // no null keys
		//ht.put(5,null); // no null values
		
		System.out.println("The map is currently: " + ht);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		ht.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + ht);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + ht.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + ht.remove(2));
		
		System.out.println("The map after removing item 2: " + ht);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  ht.size());
		
		
		//print keys
		for(int i: ht.keySet()) {
			System.out.println(i);
		}
		
		
		//print values
		for(String s: ht.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : ht.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		
		//search for value
		System.out.println("Does map contain value: " + ht.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key: " + ht.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + ht.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + ht );
		
		
		//clear out map
		ht.clear();
		
		System.out.println("The map after clearing it out: " + ht);
		
		System.out.println("is map empty: " + ht.isEmpty());
		
		
		
	}

}
