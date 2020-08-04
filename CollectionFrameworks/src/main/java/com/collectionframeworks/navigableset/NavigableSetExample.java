package com.collectionframeworks.navigableset;

import java.util.TreeSet;

public class NavigableSetExample {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("c");
		t.add("a");
		t.add("b");
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}
