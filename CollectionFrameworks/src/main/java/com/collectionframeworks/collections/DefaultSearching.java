package com.collectionframeworks.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DefaultSearching {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("ganesh");
		l.add("anand");
		l.add("dandi");
		l.add("tathagari");
		l.add("dvp");
		System.out.println(l);// [ganesh,anand,dandi,tathagari,dvp]
		Collections.sort(l);
		System.out.println(l);// [anand,dandi,dvp,ganesh,tathagari]
		System.out.println(Collections.binarySearch(l, "dandi"));//1
		System.out.println(Collections.binarySearch(l, "rvp"));// -5-
	}
}
