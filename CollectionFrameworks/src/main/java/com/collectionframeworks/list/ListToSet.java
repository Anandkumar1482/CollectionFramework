package com.collectionframeworks.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(55);
		l.add(20);
		System.out.println(l);
		Set<Integer> s = new HashSet<Integer>(l);
		System.out.println(s);

	}

}
