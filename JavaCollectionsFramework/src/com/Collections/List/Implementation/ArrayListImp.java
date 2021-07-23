package com.Collections.List.Implementation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListImp {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<>();
		
		// add/insert elements to list
		aList.add("Kevin");
		aList.add("John");
		aList.add("Andy");
		aList.add("Tom");
		aList.add("Cliff");
		
		aList.add(0, "Julia");
		
		
		System.out.println("The original ArrayList is: " + aList); 
		
		// gets size of the ArrayList object 
		System.out.println("The Size of the Arraylist is: " + aList.size());
		
		
		
		// remove/delete element from list for given index 
		System.out.println("Removed person at index 2: " + aList.remove(2));
		
		
		System.out.println("The ArrayList is after removing 2nd index: " + aList);
		
		
		// get element at index specified
		System.out.println("ArrayList element at index 2: " +  aList.get(2));
		
		
		// update a value at a specified index
		System.out.println("The person replaced in the list at index 1: " + aList.set(1, "Jimmy"));
		
		
		System.out.print("The ArrayList after updating person at 1st index: "); 
		
		for(String next: aList)
			System.out.print(next + ", ");
		System.out.println();
		
		
		// convert ArrayList object to an Array
		Object[] strArr = aList.toArray();	
		
		System.out.println("The ArrayList converted to an array: " + Arrays.toString(strArr));
		
		
		//check if arrayList Contains a value
		System.out.println("Does the arraylist contain Tom ? " + aList.contains("Tom"));
		
		//gets index of a certain value
		System.out.println("What index in the arraylist is Tom ? " + aList.indexOf("Tom"));
		
		
		// converting ArrayList to String
		System.out.println("Converting ArrayList to a String: " + aList.toString());
		
		
		
		// clearing ArrayList means removing all entries in the List
		aList.clear();
		
		System.out.println("The ArrayLsit after being cleared: " + aList);
		
		
		// checks to see if list is empty
		
		System.out.println("Is arraylist empty? " + aList.isEmpty() );
		
		
		
		
		
		
		

	}

}
