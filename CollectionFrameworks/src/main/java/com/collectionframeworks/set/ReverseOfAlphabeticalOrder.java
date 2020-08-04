package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseOfAlphabeticalOrder {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new MyCompa());
		ts.add("Apj Adhulkalam");
		ts.add("gandhi");
		ts.add("Bhagath Sing");
		ts.add("Alluri Seetharamaraj");
		ts.add("Cheguveera");
		ts.add("Ntr");
		System.out.println(ts);

	}
}

class MyCompa implements Comparator<String> {

	@Override
	public int compare(String obj1, String obj2) {
		String s1 = obj1.toString();
		String s2 = obj2;
		// return s1.compareTo(s2);//output:::[Alluri Seetharamaraj, Apj Adhulkalam,
		// Bhagath Sing, Cheguveera, Ntr, gandhi]
		return s2.compareTo(s1);// [gandhi, Ntr, Cheguveera, Bhagath Sing, Apj Adhulkalam, Alluri Seetharamaraj]

		// return -s1.compareTo(s2)
	}

}