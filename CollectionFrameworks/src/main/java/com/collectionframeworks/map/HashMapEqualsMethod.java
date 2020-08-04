package com.collectionframeworks.map;

import java.util.HashMap;

public class HashMapEqualsMethod {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "anand");
		m.put(I2, "kumar");
		System.out.println(m);
		System.out.println(m.get(10));
	}
}
