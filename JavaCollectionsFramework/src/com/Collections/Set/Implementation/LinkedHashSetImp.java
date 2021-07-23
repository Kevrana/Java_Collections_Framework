package com.Collections.Set.Implementation;

import java.util.LinkedHashSet;

public class LinkedHashSetImp {

	public static void main(String[] args) {
		
		
		// declare and instantiate a LinkedHashSet
		// same as hashset, but maintains insertion order, unlike regular Hashset
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		// add to the set, no duplicates and does maintain insertion order, can have at most one null
		lhs.add(2);
		lhs.add(6);
		lhs.add(1);
		lhs.add(-4);
		lhs.add(45);
		lhs.add(16);
		
		System.out.println("The set is currently: " + lhs);
		
		
		// checks if hs contains an element
		System.out.println("Does set contain '45' ? " + lhs.contains(45));
		
		// remove an eelement
		System.out.println("Removing element '2':  " + lhs.remove(2));
		
		
		System.out.println("The set is currently: " + lhs);
		
		
		//size of set
		System.out.println("The set is currently: " + lhs.size());
		
		// adding a duplicate value
		System.out.println("Can I add another '45' to the set? " + lhs.add(45));
		
	
		// adding a null value
		System.out.println("Can I add a null to the set? " + lhs.add(null));
		
		// adding a 2nd null value
		System.out.println("Can I add another null to the set? " + lhs.add(null));
		
		// clears set
		lhs.clear();
		System.out.println("After clearing set: " + lhs);
		
		
		// checks if set is empty or not
		System.out.println("IS set empty? " + lhs.isEmpty());

	}

}
