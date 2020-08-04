package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizingSearching {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l, new MyCom());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10, new MyCom()));//2
		System.out.println(Collections.binarySearch(l, 13, new MyCom()));//-3
		System.out.println(Collections.binarySearch(l, 17));// -6 unpredicatble Result
		System.out.println(Collections.binarySearch(l, 17,new MyCom()));//-2
	}

}
 
class MyCom implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		return i2.compareTo(i1);
	}

}
