package com.hashmap;

import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>(new Employee());
		t.put(101, "ramesh");
		t.put(105, "ganesh");
		t.put(103, "anand");
		System.out.println(t);
	}
}
