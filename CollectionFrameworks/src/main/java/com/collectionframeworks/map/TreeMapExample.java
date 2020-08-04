package com.collectionframeworks.map;

import java.util.TreeMap;

//Default Natural Sorting order
public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(101, "AAA");
		t.put(102, "BBBB");
		t.put(103, "UK");
		t.put(104, 106);
		// t.put("yyy", "Hetrogenious"); //CE:class cast exception
		// java.lang.Integer cannot be cast to java.lang.String
		t.put(null, "a");// RE:java.lang.NullPointerException
		System.out.println(t);// output:{101=AAA, 102=BBBB, 103=UK, 104=106}
	}
}
