package com.collectionframeworks.navigableset;

import java.util.TreeMap;

public class NavigableMapMethods {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		t.put("bharath", 104);
		t.put("chitra", 101);
		t.put("ample", 102);
		t.put("durga", 105);
		t.put("ganesh", 103);
		System.out.println(t);// {ample=103, bharath=101, chitra=102 , durga=104, ganesh=105}
		System.out.println(t.ceilingKey("ample"));// ample
		System.out.println(t.higherKey("durga"));// ganesh
		System.out.println(t.floorKey("chitra"));// chitra
		System.out.println(t.lowerKey("ganesh"));// durga
		System.out.println(t.pollFirstEntry());// ample=103
		System.out.println(t.pollLastEntry());// ganesh=105
		System.out.println(t.descendingMap());// {durga=104, chitra=102, bharath=101}
		System.out.println(t);// {bharath=101, chitra=102, durga=104}
	}
}
