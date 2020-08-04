package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyCom());// ------------(1)
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);// [20, 15, 10, 5, 0]
	}

}

class MyCom implements Comparator<Integer> {

	@Override
	public int compare(Integer obj1, Integer obj2) {
		Integer I1 = obj1;
		Integer I2 = obj2;
		if (I1 < I2) {
			return +1;
		} else if (I1 > I2) {

			return -1;
		} else
			return 0;

	}

}