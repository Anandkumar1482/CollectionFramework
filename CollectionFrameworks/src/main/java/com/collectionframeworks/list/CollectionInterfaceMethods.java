package com.collectionframeworks.list;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionInterfaceMethods {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l.remove(3));
		l.addAll(l);
		System.out.println(l);
		/*
		 * l.removeAll(l); System.out.println(l);
		 */

		System.out.println(l.contains(40));
		System.out.println(l.containsAll(l));
		System.out.println(l.isEmpty());
		System.out.println(l.size());

		Object[] obj = l.toArray();
		System.out.println(obj);
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			i.next();
			System.out.println(i);
		}

	}
}
