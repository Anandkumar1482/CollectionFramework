package com.hashmap;

import java.util.HashMap;

class Temp {

	@Override
	public String toString() {

		return "temp";
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Finalize method will be called");
	}
}

public class WeakHashMapGc {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Object, String> m = new HashMap<>();
		Temp t = new Temp();
		m.put(t, "dandi");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);

	}
}
