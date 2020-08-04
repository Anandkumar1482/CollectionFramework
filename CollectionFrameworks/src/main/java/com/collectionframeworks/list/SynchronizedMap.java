package com.collectionframeworks.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "anand");
		map.put(2, "kumar");
		map.put(3, "dandi");
		map.put(4, "ashok");
		map.put(5, "dhana");
		map.put(6, "ram");
		map.put(7, "krishna");
		System.out.println(map);
		Map<Integer, String> map1 = Collections.synchronizedMap(map);
		/*synchronized (map1) {
			Iterator<Integer> i = map1.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}*/

		}
	}

