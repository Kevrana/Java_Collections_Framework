package com.Map.Implementation;

import java.util.Hashtable;
import java.util.Map;

public class HashTableImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declare and instantiate a HashTable,
		//synced, thread safe , no null keys/value
		Hashtable<Integer, String> lhs = new Hashtable<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		lhs.put(1,"Kevin");
		lhs.put(4,"Dojo");
		lhs.put(2,"Charlie");
		lhs.put(3,"Tim");
		
		
		//can't add null to hashtables
//		lhs.put(null,null);
		
		System.out.println("The map is currently: " + lhs);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		lhs.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + lhs);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + lhs.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + lhs.remove(2));
		
		System.out.println("The map after removing item 2: " + lhs);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  lhs.size());
		
		
		//print keys
		for(int i: lhs.keySet()) {
			System.out.println(i);
		}
		
		
		//print keys
		for(String s: lhs.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : lhs.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		
		//search for value
		System.out.println("Does map contain value: " + lhs.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key: " + lhs.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + lhs.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + lhs );
		
		
		//clear out map
		lhs.clear();
		
		System.out.println("The map after clearing it out: " + lhs);
		
		System.out.println("is map empty: " + lhs.isEmpty());
		
		
		
	}

}
