package com.hashmap;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		IdentityHashMap<Integer, String> h = new IdentityHashMap<>();

		h.put(I1, "anand");
		h.put(I2, "dandi");
		System.out.println(h);

	}
}
