package com.Collections.Set.Implementation;

import java.util.HashSet;

public class HashSetImp {

	public static void main(String[] args) {
	
		// declare and instantiate a HashSet
		
		HashSet<Integer> hs = new HashSet<>();
		
		// add to the set, no duplicates and doesn't maintain insertion order, can have at most one null
		hs.add(2);
		hs.add(6);
		hs.add(1);
		hs.add(-4);
		hs.add(45);
		hs.add(16);
		
		System.out.println("The set is currently: " + hs);
		
		
		// checks if hs contains an element
		System.out.println("Does set contain '45' ? " + hs.contains(45));
		
		// remove an eelement
		System.out.println("Removing element '2':  " + hs.remove(2));
		
		
		System.out.println("The set is currently: " + hs);
		
		
		//size of set
		System.out.println("The size of the set is currently: " + hs.size());
		
		// adding a duplicate value
		System.out.println("Can I add another '45' to the set? " + hs.add(45));
		
	
		// adding a null value
		System.out.println("Can I add a null to the set? " + hs.add(null));
		
		// adding a 2nd null value
		System.out.println("Can I add another null to the set? " + hs.add(null));
		
		// clears set
		hs.clear();
		System.out.println("After clearing set: " + hs);
		
		
		// checks if set is empty or not
		System.out.println("IS set empty? " + hs.isEmpty());
		

	}

}
