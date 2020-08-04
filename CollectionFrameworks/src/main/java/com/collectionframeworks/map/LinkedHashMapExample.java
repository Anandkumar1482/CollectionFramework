package com.collectionframeworks.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
		h.put("anand", 100);
		h.put("kumar", 101);
		h.put("dandi", 103);
		h.put("nag", 104);
		h.put("mahati", 105);
		h.put("suresh", 106);
		System.out.println(h);
	}
}
