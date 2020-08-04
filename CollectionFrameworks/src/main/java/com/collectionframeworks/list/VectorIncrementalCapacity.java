package com.collectionframeworks.list;

import java.util.Vector;

public class VectorIncrementalCapacity {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2, 5);
		System.out.println(v.capacity());
		v.addElement(20);
		v.addElement(10);
		v.addElement(30);
		v.addElement(40);
		System.out.println(v);
		System.out.println(v.capacity());
	}
}
