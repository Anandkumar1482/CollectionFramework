package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseOrderMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l, new MyC());
		System.out.println("After Sorting");
		System.out.println(l);
		Comparator<Object> c1 = Collections.reverseOrder(new MyC());
		System.out.println("reverse Order Of Comparator");
		System.out.println(c1);

	}

}

class MyC implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		return i2.compareTo(i1);
	}

}
