package com.Collections.List.Implementation;

import java.util.Stack;

public class StackImp {

	public static void main(String[] args) {
		
		
		// stack follows LIFO
		// Since it extends the Vector Class, it is also thread safe, and involves overhead. 
		// Reccomended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded enviornment
	
		
		
		//declare and instantiate a stack object of type String
	
		Stack<String> names = new Stack<>();
		
		// pushing element on the top of the stack
		names.push("Kevin");// bottom, position 7
		names.push("Brian");
		names.push("Eric");
		names.push("Steve");
		names.push("Jim");
		names.push("Carl");
		names.push("Cindy");// top, position 1
		
		System.out.println("The Stack is currently as: " + names);
		System.out.println("The Stack size is  currently: " + names.size());
		
		
		//removing or "popping" from top of the stack cause LIFO
		System.out.println("The name removed from top of the stack: " + names.pop());
		
		System.out.println("The Stack is currently as: " + names);
		
		// To display element on top of the stack
		System.out.println("The name on top of the stack is: " + names.peek());
		
		
		// check if stack is empty
		System.out.println("Is stack empty: " + names.empty());
		
		// search stack for a specified element
		System.out.println("Which posiiton in the stack is Eric? " + names.search("Eric"));
		
		
		
		
		

	}

}
