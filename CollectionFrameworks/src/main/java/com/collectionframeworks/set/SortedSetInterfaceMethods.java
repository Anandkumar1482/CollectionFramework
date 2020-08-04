package com.collectionframeworks.set;

import java.util.TreeSet;

public class SortedSetInterfaceMethods {
	public static void main(String[] args) {
		TreeSet<Integer> st = new TreeSet<Integer>();
		st.add(101);
		st.add(102);
		st.add(103);
		st.add(104);
		st.add(105);
		st.add(106);
		st.add(107);
		st.add(109);
		System.out.println(st);
		System.out.println(st.first());
		System.out.println(st.last());
		System.out.println(st.headSet(105));
		System.out.println(st.tailSet(104));
		System.out.println(st.subSet(101, 105));

	}
}
