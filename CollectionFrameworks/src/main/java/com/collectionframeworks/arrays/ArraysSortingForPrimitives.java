package com.collectionframeworks.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortingForPrimitives {
	public static void main(String[] args) {
		int a[] = { 2, 4, 10, 3, 7, 1, 6, 9, 0 };
		System.out.println("\nPrimitive Array Before sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("\nPrimitive Array After Sorting");
		for (int a2 : a) {
			System.out.println(a2);
		}
		String s[] = { "anand", "kumar", "dandi", "tathagari", "rvp" };
		System.out.println("\nObject Array Before Sorting ");
		for (String s1 : s) {
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("\nObject Array After Sorting ");
		for (String s2 : s) {
			System.out.println(s2);
		}
		Arrays.sort(s, new My());
		System.out.println("\nObject Array After Sorting by using Comparator object");
		for(String s3:s) {
			System.out.println(s3);
		}
	}
}

class My implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);
	}

}
