package com.collectionframeworks.arrays;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(11);
		l.add(21);
		l.add(12);
		l.add(14);
		l.add(13);
		l.add(121);
		System.out.println(l);
		Object[] obj =  l.toArray();
		for (Object objects : obj) {
			System.out.println(objects);
		}
	}
}