package com.collectionframeworks.Queue;

import java.util.PriorityQueue;

/*Note: Some platforms may not provide proper supports for PriorityQueue [windowsXP].*/

public class QueueInterfacemMethod {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		System.out.println(queue.peek());// null
		// System.out.println(queue.element());RE:NoSuchElementException
		queue.offer(100);
		queue.offer(200);
		System.out.println(queue.poll());// 100
		// System.out.println(queue.remove());
		System.out.println(queue);// [200]
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);// [0, 2, 1, 6, 3, 4, 5, 200, 7, 8, 9]
		System.out.println(queue.poll());// 0 remove head element
		System.out.println(queue.remove());// 1 remove head elelment
		System.out.println(queue);// [2, 3, 4, 6, 8, 9, 5, 200, 7]
	}
}
