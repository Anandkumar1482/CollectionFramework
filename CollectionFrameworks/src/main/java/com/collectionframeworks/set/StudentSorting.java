package com.collectionframeworks.set;

import java.util.Comparator;

class Customer implements Comparator<Object> {
	int rollno;
	String name;
	int marks;

	public Customer() {
		super();
	}

	public Customer(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Customer [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {
		Customer c1 = (Customer) o1;
		Customer c2 = (Customer) o2;

		String name1 = c1.name;
		String name2 = c2.name;

		return -name1.compareTo(name2);
	}
}
