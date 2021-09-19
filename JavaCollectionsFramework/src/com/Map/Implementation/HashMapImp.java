package com.Map.Implementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

	public static void main(String[] args) {
		
		
		//declare and instantiate a HashMap, doesn't maintain insertion order
		// allows one null key, many null values
		// not synced, not thread safe
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		hm.put(1,"Kevin");
		hm.put(4,"Dojo");
		hm.put(2,"Charlie");
		hm.put(3,"Tim");
		
		
		//hashmap allows one null key, andd many null value
//		hs.put(null, null);
//		
//		// adding anothe null key
//		hs.put(null, "kjhkjh");
		
		System.out.println("The map is currently: " + hm);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		hm.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + hm);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + hm.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + hm.remove(2));
		
		System.out.println("The map after removing item 2: " + hm);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  hm.size());
		
		
		//print keys
		for(int i: hm.keySet()) {
			System.out.println(i);
		}
		
		
		//print values
		for(String s: hm.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : hm.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		System.out.println("!!!!!!!!@!#!@ does hm have a key 4: " + hm.keySet().contains(4));
		
		
		//search for value
		System.out.println("Does map contain value 'Kevin': " + hm.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key '2': " + hm.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + hm.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + hm );
		
		
		//clear out map
		hm.clear();
		
		System.out.println("The map after clearing it out: " + hm);
		
		System.out.println("is map empty: " + hm.isEmpty());
		

	}

}
