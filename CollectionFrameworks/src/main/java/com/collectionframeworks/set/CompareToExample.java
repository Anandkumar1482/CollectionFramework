package com.collectionframeworks.set;

public class CompareToExample {
	public static void main(String[] args) {
		System.out.println("a".compareTo("z"));// -ve
		System.out.println("z".compareTo("a"));// +ve
		System.out.println("a".compareTo("a"));// 0
		// System.out.println("A".compareTo(null));//NullPointerException
	}
}
/*
 * If we are depending on default natural sorting order then internally JVM will
 * use compareTo() method to arrange objects in sorting order.
 */