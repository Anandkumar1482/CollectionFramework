package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyMy implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		int n1 = (int) o1;
		int n2 = (int) o2;

		return (n1 < n2) ? -1 : (n1 > n2) ? 1 : 0;
	}
}

public class PreSorting {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyMy());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(15);
		t.add(25);
		t.add(35);
		System.out.println(t);
	}
}
