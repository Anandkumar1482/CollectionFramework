package com.collectionframeworks.map;

import java.util.HashMap;

/*if we add key-value pair into the HashMap object if key is already available 
 it will be replaced old value with new value and it return old value*/
public class MapWithNull {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("anand", 100);
		h.put("kumar", 101);
		h.put("dandi", 103);
		h.put("nag", 104);
		h.put(null, 1000);
		h.put("mahati", 105);
		h.put("suresh", 106);
		h.put(null, 1001);
		System.out.println(h);
	}
}
