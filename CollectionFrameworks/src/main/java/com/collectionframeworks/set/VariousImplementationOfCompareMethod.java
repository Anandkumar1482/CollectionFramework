package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

public class VariousImplementationOfCompareMethod {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new OurComparator());// ------------(1)
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);// [20, 15, 10, 5, 0]
	}

}

class OurComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer obj1, Integer obj2) {

		/*
		 * Integer I1 = obj1; Integer I2 = obj2;
		 */

		// 1)return I1.compareTo(I2);// Default Natural Sorting Order[Ascending order]
		// output is:[0,5,10,15,20]

		// 2)return -I1.compareTo(I2);// Descending order[20,15,10,5,0]
		// 3)return I2.compareTo(I1); // Descending order[20,15,10,5,0]
		//return -I2.compareTo(I1); // Ascending order [0,5,10,15,20]
		// 5)return +1;
		return -1;

	}
}
