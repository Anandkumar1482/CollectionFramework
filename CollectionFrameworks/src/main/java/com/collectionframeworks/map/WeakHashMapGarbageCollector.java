package com.collectionframeworks.map;

import java.util.WeakHashMap;

public class WeakHashMapGarbageCollector {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Temp, String> map = new WeakHashMap<Temp, String>();
		Temp t = new Temp();
		map.put(t, "HashMapObject");
		System.out.println(map);
		t = null;
		System.out.println("in the case of WeakHashMap if an object does not have any references then it’s\n"
				+ "always eligible for GC even though it is associated with WeakHashMap that is garbage\n"
				+ "collector dominates WeakHashMap.");
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
}
