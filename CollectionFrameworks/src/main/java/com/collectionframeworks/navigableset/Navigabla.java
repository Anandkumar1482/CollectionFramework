package com.collectionframeworks.navigableset;

import java.util.TreeSet;

public class Navigabla {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);

		System.out.println(t);
		System.out.println(" lower " + t.lower(2000));
		System.out.println(" floor " + t.floor(3000));
		System.out.println(" higher " + t.higher(3000));
		System.out.println(" ceiling " + t.ceiling(3000));
		System.out.println(" pollFirst " + t.pollFirst());
		System.out.println(" pollLast " + t.pollLast());
		System.out.println(" descendingSet " + t.descendingSet());
		System.out.println(t);

	}
}
