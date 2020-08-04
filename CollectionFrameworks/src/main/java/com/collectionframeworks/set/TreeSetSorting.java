package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

class OurCompa implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String s1 = o1;
		String s2 = o2.toString();

		// return -1;
		// return +1;
		return -s1.compareTo(s2);

	}

}

public class TreeSetSorting {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new OurCompa());
		t.add("anand");
		t.add("raj");
		t.add("suresh");
		t.add("ramesh");
		t.add("ganesh");
		t.add("ali");
		t.add("mohan");
		t.add("balaji");
		t.add("jagadeesh");
		System.out.println(t);
	}
}
