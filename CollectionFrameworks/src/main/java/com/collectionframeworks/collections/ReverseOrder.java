package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrder {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(30);
		System.out.println(l);
		Comparator<Object> c = Collections.reverseOrder(new MyC());
		System.out.println(c);
	}
}
