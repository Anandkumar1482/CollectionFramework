package com.collectionframeworks.set;

import java.util.TreeSet;

public class StudentSort {
	public static void main(String[] args) {
		Customer c = new Customer(101, "anand", 98);
		Customer c1 = new Customer(102, "ramesh", 87);
		Customer c2 = new Customer(101, "suresh", 99);
		Customer c3 = new Customer(102, "kalpesh", 70);
		Customer c4 = new Customer(101, "meghana", 90);
		Customer c5 = new Customer(102, "aravind", 80);

		TreeSet<Customer> t = new TreeSet<Customer>(new Customer());
		t.add(c);
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		t.add(c5);
		System.out.println(t);
	}
}
