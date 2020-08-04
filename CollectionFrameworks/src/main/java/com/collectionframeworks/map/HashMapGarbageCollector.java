package com.collectionframeworks.map;

import java.util.HashMap;

public class HashMapGarbageCollector {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Temp, String> map = new HashMap<Temp, String>();
		Temp t = new Temp();
		map.put(t, "HashMapObject");
		System.out.println(map);
		t = null;
		System.out.println("in the case of HashMap ,if an object is not eligible for GC even though it doesn’t\n"
				+ "have any references if it is associated with HashMap That is HashMap dominates\n"
				+ "garbage collector.");
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
}
