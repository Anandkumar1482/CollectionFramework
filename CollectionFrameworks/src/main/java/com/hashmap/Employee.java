package com.hashmap;

import java.util.Comparator;

public class Employee implements Comparator<Object> {
	int eno;
	String name;

	public Employee() {
	}

	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);

	}

}
