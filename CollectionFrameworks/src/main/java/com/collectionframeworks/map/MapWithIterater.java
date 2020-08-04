package com.collectionframeworks.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapWithIterater {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("anand", 100);
		h.put("kumar", 101);
		h.put("dandi", 103);
		h.put("nag", 104);
		h.put("mahati", 105);
		h.put("suresh", 106);
		System.out.println(h);
		Set<Entry<String, Integer>> set1 = h.entrySet();
		System.out.println(set1);
		
		// if we want get object one by one then cursor is required.
		Set<Entry<String, Integer>> s1 = h.entrySet();
		System.out.println("***** the objects are getting one by one from the Map ******");
		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> map =(Entry<String, Integer>) itr.next();
			System.out.println(map.getKey() + "-" + map.getValue());
			if(map.getKey().equals("nag")) {
				map.setValue(500);
			}
		}
		System.out.println(h);

	}

}
