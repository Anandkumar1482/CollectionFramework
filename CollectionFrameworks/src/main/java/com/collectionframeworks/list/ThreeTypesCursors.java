package com.collectionframeworks.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ThreeTypesCursors {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		System.out.println(e.getClass().getName());

		Iterator<Integer> itr = v.iterator();
		System.out.println(itr.getClass().getName());

		ListIterator<Integer> ltr = v.listIterator();
		System.out.println(ltr.getClass().getName());

	}
}
