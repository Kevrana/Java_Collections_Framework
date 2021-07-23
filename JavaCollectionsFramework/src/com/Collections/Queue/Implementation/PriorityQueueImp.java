package com.Collections.Queue.Implementation;

import java.util.PriorityQueue;

public class PriorityQueueImp {

	public static void main(String[] args) {
		
		
		//declare and instantiate a PriorityQueue object
		// THIS DOES NOT FOLLOW THE FIFO RULE, rather,
		// it orders elements based on PRIORITY, natural order unless specified.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// adding to the priority queue
		pq.add(4);
		pq.add(6);
		pq.add(1);
		pq.add(0);
		pq.add(-2);   
		pq.add(10);
		
		// another way to add
		pq.offer(22);

		
		
		//print the queue
		System.out.println("The PriorityQueue is currently: " + pq);
		
		//peek at the head of the queue, can only access the head for Queues using peek, 
		System.out.println("The current head of the queue is: " + pq.peek());
		
		
		//remove the head
		System.out.println("The head removed from queue: " + pq.poll());
		
		//print the queue
		System.out.println("The PriorityQueue after removing head using poll: " + pq);
				
		//another way to remove head using remove() the queue
		System.out.println("Removing the current head of the queue using remove: " + pq.remove());
	
		
		//print the queue
		System.out.println("The PriorityQueue after removing head using remove: " + pq);
						
		
		// removing a specific element from queue
		System.out.println("Removing 4 from the queue: " + pq.remove(4));
		
		
		//print the queue
		System.out.println("The PriorityQueue after removing element 4: " + pq);
						
		//peek at the head of the queue
		System.out.println("The current head of the queue is: " + pq.peek());
		
		
		//contains a value
		System.out.println("Does the queue contain 10? " + pq.contains(10));
		
		//clear the queue
		pq.clear();
		
		
		System.out.println("The queue after being cleared: " + pq);
		
		// try to get head on an empty queue
		System.out.println("The head on this empty queue: " + pq.poll());
		
				
	}

}
