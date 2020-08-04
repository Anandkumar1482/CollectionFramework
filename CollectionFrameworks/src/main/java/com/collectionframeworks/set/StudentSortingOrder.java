package com.collectionframeworks.set;

import java.util.TreeSet;

public class StudentSortingOrder {
	public static void main(String[] args) {
		Student s1 = new Student("anand", 101);
		Student s2 = new Student("dandi", 102);
		Student s3 = new Student("ganesh", 10);
		Student s4 = new Student("suresh", 104);
		Student s5 = new Student("meghana", 105);
		Student s6 = new Student("mukunda", 106);
		Student s7 = new Student("surendra", 107);
		Student s8 = new Student("nagendra", 108);
		Student s9 = new Student("mukesh", 109);

		TreeSet ts = new TreeSet(new Student());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);
		ts.add(s9);
		System.out.println(ts);

	}

}