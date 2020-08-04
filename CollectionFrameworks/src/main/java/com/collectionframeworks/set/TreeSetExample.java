package com.collectionframeworks.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(2);
		l.add(25);
		l.add(50);
		l.add(15);
		l.add(20);
		System.out.println(l);
		TreeSet<Integer> ts = new TreeSet<Integer>(l);
		System.out.println(ts);

	}
}
 