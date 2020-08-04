package com.collectionframeworks.list;

import java.util.Vector;

/*Creates an empty Vector object with default initial capacity 10.
Once Vector reaches its maximum capacity then a new Vector object will be created
with double capacity. That is “newcapacity=currentcapacity*2”.*/

public class VectorExample {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());// 10
		for (int i = 1; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());// 10
		v.addElement("A");
		System.out.println(v.capacity());// 20
		System.out.println(v);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
	}
}
