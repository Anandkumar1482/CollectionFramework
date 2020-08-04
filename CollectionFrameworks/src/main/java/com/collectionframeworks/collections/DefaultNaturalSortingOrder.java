package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;

/*To sort the elements of List according to default natural sorting order in this case the
elements should be homogeneous and comparable otherwise we will get
ClassCastException.*/

public class DefaultNaturalSortingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(5);
		l.add(300);
		l.add(30);
		l.add(45);
		l.add(70);
		l.add(250);
		// l.add(new String("anand"));//ClassCastException
		// java.lang.String
		// l.add(null);//List should not contain null otherwise we will get NPE
		System.out.println("before sorting ");
		System.out.println(l);// [100, 5, 300, 30, 45, 70, 250]
		Collections.sort(l);
		System.out.println("After sorting ");
		System.out.println(l);// [5, 30, 45, 70, 100, 250, 300]
	}
}
