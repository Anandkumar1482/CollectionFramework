package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizingSortingOrger {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(5);
		l.add(300);
		l.add(30);
		l.add(45);
		l.add(70);
		l.add(250);
		System.out.println("Before Sorting");
		System.out.println(l);
		Collections.sort(l, new Cmp());
		System.out.println("After Sorting");
		System.out.println(l);

	}
}

class Cmp implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		return I2.compareTo(I1);
	}

}