package com.Map.Implementation;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImp {
	public static void main(String[] args) {
		
		//declare and instantiate a TreeMap, sorted order
		// not synced, not thread safe
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		tm.put(1,"Kevin");
		tm.put(4,"Dojo");
		tm.put(2,"Charlie");
		tm.put(3,"Tim");
		
		
		//treemaps don't allow null keys, but many null values
		tm.put(5, null);
//		tm.put(null,null);
		tm.put(6, null);

		System.out.println("The map is currently: " + tm);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		tm.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + tm);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + tm.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + tm.remove(2));
		
		System.out.println("The map after removing item 2: " + tm);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  tm.size());
		
		
		//print keys
		for(int i: tm.keySet()) {
			System.out.println(i);
		}
		
		
		//print keys
		for(String s: tm.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : tm.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		
		//search for value
		System.out.println("Does map contain value: " + tm.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key: " + tm.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + tm.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + tm );
		
		
		//clear out map
		tm.clear();
		
		System.out.println("The map after clearing it out: " + tm);
		
		System.out.println("is map empty: " + tm.isEmpty());
		
	}

}
