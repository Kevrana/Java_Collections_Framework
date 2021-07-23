package com.Collections.Set.Implementation;

import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		
		// declare and instantiate a TreeSet
		// sorts the elements and in ascending order
		// can't add nulls to treesets
		TreeSet<Integer> ts = new TreeSet<>();
		
		// add to the set, no duplicates and doesn't maintain insertion order
		ts.add(2);
		ts.add(6);
		ts.add(1);
		ts.add(-4);
		ts.add(45);
		ts.add(16);
		
		System.out.println("The set is currently: " + ts);
		
		
		// checks if hs contains an element
		System.out.println("Does set contain '45' ? " + ts.contains(45));
		
		// remove an eelement
		System.out.println("Removing element '2':  " + ts.remove(2));
		
		
		System.out.println("The set is currently: " + ts);
		
		
		//size of set
		System.out.println("The set is currently: " + ts.size());
		
		// adding a duplicate value
		System.out.println("Can I add another '45' to the set? " + ts.add(45));
		
	
		// get ceiling of the elemnt or null
		System.out.println("Return the ceiling of 7 from set: " + ts.ceiling(7));
		
		// get floor of the elemnt or null
		System.out.println("Return the floor of 5 from set: " + ts.floor(3));
				
		
		
		// can't add null values to treesets
		
		// clears set
		ts.clear();
		System.out.println("After clearing set: " + ts);
		
		
		// checks if set is empty or not
		System.out.println("IS set empty? " + ts.isEmpty());
		
		

	}

}
