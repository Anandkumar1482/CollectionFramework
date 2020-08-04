package com.hashmap;

import java.util.Comparator;
import java.util.TreeMap;

class M implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return i2.compareTo(i1);
	}

}

public class TreeMapExam {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<>(new M());
		t.put("anand", 101);
		t.put("tathagari", 99);
		t.put("dandi", 100);
		System.out.println(t);

	}

}
