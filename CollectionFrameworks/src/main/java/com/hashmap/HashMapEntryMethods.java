package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntryMethods {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("anand", 101);
		h.put("kumar", 102);
		h.put("anji", 1023);
		h.put("gowtham", 105);
		h.put("rajiv", 104);
		h.put("ramana", 1021);
		h.put("teja", 1022);
		System.out.println(h);

		/* to print set of Entry Objects -- key-value pair */
		Set<Entry<String, Integer>> s1 = h.entrySet();
		System.out.println(s1);

		/* to print only key values */
		Set<String> s2 = h.keySet();
		System.out.println(s2);

		/* to print only values */
		Collection<Integer> c = h.values();
		System.out.println(c);

		Iterator<Entry<String, Integer>> i = s1.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> m = i.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
