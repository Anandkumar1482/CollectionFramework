package com.collectionframeworks.list;

import java.util.ArrayList;

public class ListInterfaceMethod {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		// l.add("anand");
		System.out.println(l.remove(2));
		l.add(3, 80);
		l.add(4, 70);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println();
		System.out.println(l.size());
		System.out.println(l);
		System.out.println(l);
		System.out.println(l.lastIndexOf(70));
		System.out.println(l.get(3));
		System.out.println(l.size());
		l.set(1, 45);
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(70));
	}
}
