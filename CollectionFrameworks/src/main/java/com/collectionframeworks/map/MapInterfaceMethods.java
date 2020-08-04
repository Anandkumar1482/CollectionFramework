package com.collectionframeworks.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapInterfaceMethods {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("anand", 100);
		h.put("kumar", 101);
		h.put("dandi", 103);
		h.put("nag", 104);
		h.put("mahati", 105);
		h.put("suresh", 106);
		System.out.println(h);
		// System.out.println(h.get(103));
		// System.out.println(h.containsKey(101));
		System.out.println(h.put("mahati", 1000));
		Set<String> set = h.keySet();
		System.out.println(set);
		Collection<Integer> value = h.values();
		System.out.println(value);
		Set<Entry<String, Integer>> set1 = h.entrySet();
		System.out.println(set1);

	}
}
