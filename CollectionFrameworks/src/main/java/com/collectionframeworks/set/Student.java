package com.collectionframeworks.set;

import java.util.Comparator;

public class Student implements Comparator<Object> {
	private String name;
	private int eid;

	public Student(String name, int eid) {

		this.name = name;
		this.eid = eid;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", eid=" + eid + "]";
	}

	/*
	 * //************************************* //String Objects sorting oder
	 * 
	 * @Override public int compare(Object o1, Object o2) { Student s1 = (Student)
	 * o1; Student s2 = (Student) o2; String n1 = s1.name; String n2 = s2.name;
	 * return -n1.compareTo(n2); }
	 */

	// *******************************************************
	// for integer variable sorting order

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		int n1 = s1.eid;
		int n2 = s2.eid;
		if (n1 < n2) {
			return +11;
		} else if (n1 > n2) {
			return -1;
		}

		else {
			return 0;
		}

	}
}
