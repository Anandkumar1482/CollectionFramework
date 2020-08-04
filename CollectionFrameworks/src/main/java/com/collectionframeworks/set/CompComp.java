package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparator<Object> {
	String name;
	int eid;

	public Employee() {

	}

	Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "----" + eid;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);

	}

}

class CompComp {
	public static void main(String[] args) {
		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balaiah", 200);
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 150);
		Employee e5 = new Employee("nag", 100);
		/*
		 * TreeSet t1 = new TreeSet(); t1.add(e1); t1.add(e2); t1.add(e3); t1.add(e4);
		 * t1.add(e5); System.out.println(t1);// [chiru----50, nag----100, venki----150,
		 * balaiah----200]
		 */
		TreeSet t2 = new TreeSet(new Employee());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);// [balaiah----200, chiru----50, nag----100, venki----150]
	}
}
