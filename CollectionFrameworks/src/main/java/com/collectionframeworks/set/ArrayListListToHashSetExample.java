package com.collectionframeworks.set;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListListToHashSetExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(30);
		l.add(5);
		l.add(25);
		l.add(45);
		System.out.println(l);
		HashSet<Integer> h = new HashSet<Integer>(l);
		System.out.println(h);

	}
}
