package com.collectionframeworks.set;

import java.util.TreeSet;

public class TreeSetNullAccept {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(null);
	}
}
