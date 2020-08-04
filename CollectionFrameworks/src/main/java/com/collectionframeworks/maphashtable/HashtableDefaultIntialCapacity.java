package com.collectionframeworks.maphashtable;

import java.util.Hashtable;

public class HashtableDefaultIntialCapacity {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		// Null key (or) null value is not allowed otherwise we will get
		// NullPointerException.
		// h.put(new Temp(21), null);RE:NPE
		System.out.println(h);
	}
}
