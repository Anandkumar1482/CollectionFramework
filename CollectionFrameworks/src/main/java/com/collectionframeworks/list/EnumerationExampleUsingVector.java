package com.collectionframeworks.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExampleUsingVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(15);
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		//	System.out.println(i);
		}
	}
}
