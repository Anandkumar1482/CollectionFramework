package com.collectionframeworks.list;

import java.util.Stack;

/*Methods:
1) Object push(Object o);
To insert an object into the stack.
2) Object pop();
To remove and return top of the stack.
3) Object peek();
To return top of the stack without removal.
4) boolean empty();
 Returns true if Stack is empty.
5) Int search(Object o);
 Returns offset if the element is available otherwise returns “-1”.
*/
public class StackExample {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		// s.search(19);
		System.out.println(s.search(10));
		System.out.println(s.search(11));
		System.out.println(s);
	}
}
