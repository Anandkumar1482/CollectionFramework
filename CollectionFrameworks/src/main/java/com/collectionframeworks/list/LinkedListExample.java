package com.collectionframeworks.list;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("bhaskar");
		l.add(30);
		l.add(null);
		l.add("bhaskar");
		System.out.println(l);// [bhaskar, 30, null, bhaskar]
		l.set(0, "software");
		System.out.println(l);// [software, 30, null, bhaskar]
		l.set(0, "venky");
		System.out.println(l);// [venky, 30, null, bhaskar]
		l.removeLast();
		System.out.println(l);// [venky, 30, null]
		l.addFirst(10);
		System.out.println(l);
		l.addFirst("vvv");
		System.out.println(l);// [vvv, venky, 30, null]
	}
}
