package com.collectionframeworks.arrays;

import java.util.Arrays;

public class ArraysSearchForPrimitives {
	public static void main(String[] args) {
		int a[] = { 4, 10, 3, 7, 1, 6, 9, 0 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, 2));

		String s[] = { "anand", "kumar", "dandi", "tathagari", "rvp" };
		Arrays.sort(s);
		System.out.println();

		System.out.println(Arrays.binarySearch(s, "kumar", new My()));// 2
		System.out.println(Arrays.binarySearch(s, "dvp", new My()));// 3
		System.out.println(Arrays.binarySearch(s, "N"));// -4(unpredictable result)//-1
	}
}
