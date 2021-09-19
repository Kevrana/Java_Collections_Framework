package com.Map.Implementation;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare and instantiate a LinkedHashMap, this one maintains insertion order
		// allows one null key, many null values
		// not synced, not thread safe
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>();
		
		
		//add an entry(a.k.a. a kev, value pair) to map
		lhm.put(1,"Kevin");
		lhm.put(4,"Dojo");
		lhm.put(2,"Charlie");
		lhm.put(3,"Tim");
		
		
		// allows one null key, many null values
		//lhs.put(null,null);
		lhm.put(5,null);
		lhm.put(6,null);
		
		System.out.println("The map is currently: " + lhm);
		
		
		// trying to use a duplicate key will overwrite that entry's value
		lhm.put(3,"Tod");
				
		System.out.println("The map after adding tod to 3 : " + lhm);
		
		// accessing an item
		System.out.println("The value at key 3 is : " + lhm.get(3));
		
		
		//removing item
		System.out.println("Removing item at 2: " + lhm.remove(2));
		
		System.out.println("The map after removing item 2: " + lhm);
		
		//size of hs
		
		System.out.println("The size of the map is: "+  lhm.size());
		
		
		//print keys
		for(int i: lhm.keySet()) {
			System.out.println(i);
		}
		
		
		//print keys
		for(String s: lhm.values()) {
			System.out.println(s);
		}
		
		
		//printing both with entrySet()
		for(Map.Entry<Integer,String> entry : lhm.entrySet() ) {
			
			System.out.println("The key: " + entry.getKey() + " , value: " + entry.getValue());
		
		}
		
		
		//search for value
		System.out.println("Does map contain value: " + lhm.containsValue("Kevin"));
		
		
		//search for key
		System.out.println("Does map contain key: " + lhm.containsKey(2));
				
		//replace vlaue for key
		
		System.out.println("Replacing value for key at 1: " + lhm.replace(1,"Kim"));
		
		System.out.println("Map after replacing key 1: " + lhm );
		
		
		//clear out map
		lhm.clear();
		
		System.out.println("The map after clearing it out: " + lhm);
		
		System.out.println("is map empty: " + lhm.isEmpty());
		
	}

}
