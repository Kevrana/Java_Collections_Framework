package com.Collections.List.Implementation;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImp {

	public static void main(String[] args) {
		
		// declare and initialize a linked List
		LinkedList<String> ll = new LinkedList<>();
		
		// add to linkedlist
		ll.add("Kevin"); // head
		ll.add("Micheal");
		ll.add("Sid");
		ll.add("Julio");
		ll.add("Ken"); // tail 
		
		
		// getting the contents of the linkedlist at each index up until the size of the list
		System.out.print("The LinkedList is currently: " );
		for(int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		//remove element
		System.out.println("Removed element at index 2 from list is: " + ll.remove(2));
		
		// print list using iterator 
		System.out.print("The LinkedList is currently: " );
		Iterator it = ll.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + " ");
		
		System.out.println();
		
		
		System.out.println("The person being replaced in list: " + ll.set(0, "John"));
		
		System.out.println("The list now after replacing person at 0 index: " + ll);
		
		
	
		System.out.println("Does list contain Julio? " + ll.contains("Julio"));
		
		
		//removes all elements in the list
		ll.clear();
		
		System.out.println("The list after removing all elements: " + ll);
	}

}
