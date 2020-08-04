package com.collectionframeworks.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.poll());
		// System.out.println(q.remove());
		q.offer(1);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q);

	}
}
