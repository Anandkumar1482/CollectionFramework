package com.collectionframeworks.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCusmizingSortingOrderr {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<String, Integer>(new My());
		t.put("anand", 101);
		t.put("kumar", 102);
		t.put("dandi", 103);
		t.put("suresh", 104);
		t.put("ganesh", 105);
		t.put("mahesh", 106);
		t.put("uday", 107);
		t.put("govind", 108);
		System.out.println(t);

	}
}

class My implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;

		return s2.compareTo(s1);
	}

}