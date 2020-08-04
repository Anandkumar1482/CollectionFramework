package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverse {
	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(2);
		l.add(30);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}
