package com.collectionframeworks.Queue;

import java.util.PriorityQueue;

public class PriorityQueuePlatform {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.offer(10);
		p.offer(20);
		p.offer(5);
		p.offer(15);
		p.offer(25);
		System.out.println(p);
		System.out.println(p.remove());
		System.out.println(p);
	}
}
