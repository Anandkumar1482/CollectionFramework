package com.collectionframeworks.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomizingSorting {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(15, new MyComparato());
		pq.offer("madhu");
		pq.offer("ashok");
		pq.offer("sri kanth");
		pq.offer("hemanth");
		pq.offer("laxman");
		pq.offer("jai");
		System.out.println(pq.size());
		System.out.println(pq);
	}
}

class MyComparato implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;

		return s1.compareTo(s2);
	}
}
