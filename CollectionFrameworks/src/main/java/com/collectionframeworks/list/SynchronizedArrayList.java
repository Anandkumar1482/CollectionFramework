package com.collectionframeworks.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		List<Integer> list = Collections.synchronizedList(l);
		// synchronized version //non-synchronized version
		synchronized (list) {
			Iterator<Integer> i = list.iterator(); // Must be in synchronized block
			while (i.hasNext())
				System.out.println((i.next()));
		}

	}
}
