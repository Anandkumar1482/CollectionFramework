package com.collectionframeworks.list;

import java.util.Stack;

public class StackDefaultCapacity {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");
		s.add("6");
		s.add("7");
		s.add("8");
		s.add("9");
		s.add("10");
		System.out.println(s);
		System.out.println(s);
		System.out.println(s.capacity());
		s.add("11");
		System.out.println(s.capacity());
	}
}
