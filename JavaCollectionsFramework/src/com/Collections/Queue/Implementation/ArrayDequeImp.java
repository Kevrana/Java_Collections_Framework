package com.Collections.Queue.Implementation;

import java.util.ArrayDeque;

public class ArrayDequeImp {

	public static void main(String[] args) {
		
		
		//declare and instantiate an ArrayDeque implementation of Queue
		// this is a double ended queue or Array "Deck"
		// Follows both FIFO rule of Queue and LIFO rule of Stack
		// Can be used to implement stack as it is async, not thread-safe, therefore faster
		
		ArrayDeque<String> dq = new ArrayDeque<>();
		
		
		// add to the queue
		dq.add("Liz");
		dq.add("Fez");
		dq.add("Hyde");
		dq.add("Chris");
		dq.offer("Jamie");
		
		System.out.println("The queue is currently: " + dq);
		
		// add first to the queue
		dq.addFirst("Kim");
		System.out.println("The queue is currently: " + dq);
		
		// add last to the queue like add()
		dq.addLast("Jon");
		System.out.println("The queue is currently: " + dq);
		
		
		// can add first using offer too
		dq.offerFirst("Harry");
		System.out.println("The queue is currently: " + dq);
		
		// same thing as offer, adds to the end of queue ... "Back of the line"
		dq.offerLast("Suzie");
		System.out.println("The queue is currently: " + dq);
		
		
		// to get head of queue
		System.out.println("The head of the queue using element() is: " + dq.element());
		
		// to get head of queue
		System.out.println("The head of the queue using peek() is: " + dq.peek());
		
		// to get first element of queue (head)
		System.out.println("The first element of the queue using peekFirst() is: " + dq.peekFirst());
		
		// to get last element of queue (tail)
		System.out.println("The tail element of the queue using peekLast() is: " + dq.peekLast());
		
		
		// removing head using poll, can use remove() or removeFirst() or pollFirst() or 
		System.out.println("Removing head of the queue: " + dq.poll());// .pollFirst() does the same
		System.out.println("The queue is currently: " + dq);
		
		
		
		
		
	}

}
