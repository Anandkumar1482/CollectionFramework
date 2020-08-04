package com.collectionframeworks.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LIstIteratorExample {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("nokia");
		l.add("samsung");
		l.add("lenovo");
		l.add("motorolla");
		l.add("max");
		System.out.println(l);
		ListIterator<String> ltr = l.listIterator();
		while (ltr.hasNext()) {
			String str = ltr.next();
			if (str.equals("max")) {
				ltr.remove();
			} else if (str.equals("nokia")) {
				ltr.add("nokia-6");
			} else if (str.equals("samsung")) {
				ltr.set("samsung monstar");
			} else if (str.equals("lenovo")) {
				ltr.remove();
			}
		}
		System.out.println(l);
	}
}