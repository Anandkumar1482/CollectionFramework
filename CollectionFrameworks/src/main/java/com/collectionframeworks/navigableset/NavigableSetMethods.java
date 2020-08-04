package com.collectionframeworks.navigableset;

import java.util.TreeSet;

public class NavigableSetMethods {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(25);
		t.add(5);
		t.add(35);
		t.add(15);
		t.add(45);
		t.add(55);
		System.out.println(t);//[5, 10, 15, 20, 25, 30, 35, 45, 55]
		System.out.println(t.ceiling(5));//5
		System.out.println(t.higher(30));//35
		System.out.println(t.floor(15));//15
		System.out.println(t.lower(45));//35
		System.out.println(t.pollFirst());//5
		System.out.println(t.pollLast());//55
		System.out.println(t.descendingSet());//[45, 35, 30, 25, 20, 15, 10]
		System.out.println(t);//[10, 15, 20, 25, 30, 35, 45]

	}
}
