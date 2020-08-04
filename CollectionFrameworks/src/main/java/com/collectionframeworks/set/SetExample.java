package com.collectionframeworks.set;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		h.add(70);
		System.out.println(h.add(70));
		System.out.println(h);

	}
}
