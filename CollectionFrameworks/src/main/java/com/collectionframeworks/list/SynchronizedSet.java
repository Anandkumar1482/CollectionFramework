package com.collectionframeworks.list;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSet {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		Set<Integer> set1 = Collections.synchronizedSet(set);
		synchronized (set1) {
			Iterator<Integer> i = set1.iterator(); // Must be in synchronized block
			while (i.hasNext())
				System.out.println((i.next()));
		}

	}
}
