package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

class Sorting implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

}

public class StringBufferSorting {
	public static void main(String[] args) {
		TreeSet<StringBuffer> sb = new TreeSet<StringBuffer>(new Sorting());
		sb.add(new StringBuffer("anand"));
		sb.add(new StringBuffer("kumar"));
		sb.add(new StringBuffer("rama"));
		sb.add(new StringBuffer("nag"));
		sb.add(new StringBuffer("praveen"));
		sb.add(new StringBuffer("suresh"));
		System.out.println(sb);

	}
}
