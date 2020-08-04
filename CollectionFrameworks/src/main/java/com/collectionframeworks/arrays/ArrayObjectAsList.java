package com.collectionframeworks.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayObjectAsList {
	public static void main(String[] args) {
		String[] s = { "Anand", "Zindabad", "Battle" };
		List<String> l = Arrays.asList(s);
		System.out.println(l);
	}
}