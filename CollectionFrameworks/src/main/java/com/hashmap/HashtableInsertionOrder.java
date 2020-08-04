package com.hashmap;

import java.util.Hashtable;

class HashTemp {
	int i;

	public HashTemp(int i) {
		super();
		this.i = i;
	}

	@Override
	public String toString() {

		return i + "";
	}

	@Override
	public int hashCode() {
		return i ;
	}
}

public class HashtableInsertionOrder {
	public static void main(String[] args) {
		Hashtable<HashTemp, String> h = new Hashtable<>();
		h.put(new HashTemp(5), "A");
		h.put(new HashTemp(2), "B");
		h.put(new HashTemp(6), "C");
		h.put(new HashTemp(15), "D");
		h.put(new HashTemp(23), "E");
		h.put(new HashTemp(16), "F");
		System.out.println(h);
	}
}
