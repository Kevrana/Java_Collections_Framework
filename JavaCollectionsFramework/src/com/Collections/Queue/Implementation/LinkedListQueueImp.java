package com.Collections.Queue.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueImp {

	public static void main(String[] args) {
		
		
		//declare and instantiate a Queue implemented by LinkedList
		// THIS FOLLOWS THE TRUE FIFO rule for Queues
		Queue<String> lq = new LinkedList<>();
		
		//add to queue using add()
		lq.add("Kevin");
		lq.add("Mila");
		lq.add("Tim");
		lq.add("Phil");
		
		//add to queue using offer()
		lq.offer("Carly");
		lq.offer("Freddie");
		lq.offer("Sam");
		
		
		System.out.println("The linkedlist queue is currently: " + lq);
		
		//peek at head
		System.out.println("The head of the queue is: " + lq.peek());
		
		// remove head using poll
		System.out.println("The head removed from the queue is: " + lq.poll());
		
		System.out.println("The linkedlist queue is currently: " + lq);
		
		
		//peek at head
		System.out.println("The head of the queue is: " + lq.peek());
		
		
		// remove head using remove
		System.out.println("The head removed from the queue is: " + lq.remove());
				
		System.out.println("The linkedlist queue is currently: " + lq);
		
		
		//check if queue contains a specific element
		System.out.println("Does queue contain 'Carly' ? " + lq.contains("Carly"));
		
		//remove carly
		
		System.out.println("Removing carly from queue: " + lq.remove("Carly"));
		
		
		System.out.println("The linkedlist queue is currently: " + lq);
		
		lq.clear();
		
		
		System.out.println("The linkedlist queue after clearing it out: " + lq);
		
		
		System.out.println("The head of  queue now is: " + lq.peek());
		
		
		
		
		
		
		
		

	}

}
