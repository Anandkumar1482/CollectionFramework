package com.hashmap;

import java.util.WeakHashMap;

class Temp1 {

	@Override
	public String toString() {

		return "temp";
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Finalize method is called");
	}
}

public class WeakHashMapGarbageCollector {
	public static void main(String[] args) throws InterruptedException {
		Temp1 t = new Temp1();
		WeakHashMap<Object, String> w = new WeakHashMap<>();
		w.put(t, "dandi");
		System.out.println(w);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(w);
	}
}
