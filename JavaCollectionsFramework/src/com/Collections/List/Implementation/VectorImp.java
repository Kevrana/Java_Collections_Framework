package com.Collections.List.Implementation;

import java.util.Arrays;
import java.util.Vector;

public class VectorImp {

	public static void main(String[] args) {
		//same exact thing as ArrayList but synced and one thread at a time. It doubles in size once it meets its capacity.
		
		Vector<String> vList = new Vector<>();
		
		// add/insert elements to list
		vList.add("Kevin");
		vList.add("John");
		vList.add("Andy");
		vList.add("Tom");
		vList.add("Cliff");
		
		vList.add(0, "Julia");
		
		
		System.out.println("The original vector is: " + vList); 
		
		// gets size of the vector object 
		System.out.println("The Size of the vecttor is: " + vList.size());
		
		
		
		// remove/delete element from list for given index 
		System.out.println("Removed person at index 2: " + vList.remove(2));
		
		
		System.out.println("The vector is after removing 2nd index: " + vList);
		
		
		// get element at index specified
		System.out.println("vector element at index 2: " +  vList.get(2));
		
		
		// update a value at a specified index
		System.out.println("The person replaced in the list at index 1: " + vList.set(1, "Jimmy"));
		
		
		System.out.println("The vector after updating person at 1st index: " + vList); 
		
		
		
		// convert vector object to an Array
		Object[] strArr = vList.toArray();	
		
		System.out.println("The vector converted to an array: " + Arrays.toString(strArr));
		
		
		//check if vector Contains a value
		System.out.println("Does the vector contain Tom ? " + vList.contains("Tom"));
		
		//gets index of a certain value
		System.out.println("What index in the vector is Tom ? " + vList.indexOf("Tom"));
		
		
		// converting vector to String
		System.out.println("Converting vector to a String: " + vList.toString());
		
		
		
		// clearing vector means removing all entries in the List
		vList.clear();
		
		System.out.println("The vector after being cleared: " + vList);
		
		// checks to see if list is empty
		
		System.out.println("Is vector empty? " + vList.isEmpty() );

	}

}
