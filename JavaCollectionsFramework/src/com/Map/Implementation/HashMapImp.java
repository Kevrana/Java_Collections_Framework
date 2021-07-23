package com.Map.Implementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

	public static void main(String[] args) {
		
		
		//declare and instantiate a HashMap, doesn't maintain insertion order
		// not synced, not thread safe
		HashMap<Integer, String> hs = new HashMap<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		hs.put(1,"Kevin");
		hs.put(4,"Dojo");
		hs.put(2,"Charlie");
		hs.put(3,"Tim");
		
		
		//hashmap allows one null key, andd many null value
//		hs.put(null, null);
//		
//		// adding anothe null key
//		hs.put(null, "kjhkjh");
		
		System.out.println("The map is currently: " + hs);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		hs.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + hs);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + hs.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + hs.remove(2));
		
		System.out.println("The map after removing item 2: " + hs);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  hs.size());
		
		
		//print keys
		for(int i: hs.keySet()) {
			System.out.println(i);
		}
		
		
		//print values
		for(String s: hs.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : hs.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		System.out.println("!!!!!!!!@!#!@ does hm have a key 4: " + hs.keySet().contains(4));
		
		
		//search for value
		System.out.println("Does map contain value: " + hs.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key: " + hs.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + hs.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + hs );
		
		
		//clear out map
		hs.clear();
		
		System.out.println("The map after clearing it out: " + hs);
		
		System.out.println("is map empty: " + hs.isEmpty());
		

	}

}
