package com.collectionframeworks.map;

import java.util.IdentityHashMap;

/*IdentityHashMap:
***************************************************************************
1) It is exactly same as HashMap except the following differences.
2) In the case of HashMap JVM will always use “.equals()”method to identify duplicate
keys.
3) But in the case of IdentityHashMap JVM will use== (double equal operator) to identify
duplicate keys.*/

public class IdentityHashMapDoubleEqualOperator {
	public static void main(String[] args) {
		IdentityHashMap<Integer, String> imap = new IdentityHashMap<Integer, String>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		imap.put(i1, "anand");
		imap.put(i2, "kumar");
		System.out.println(imap);
		System.out.println(imap.get(10));

	}
}
