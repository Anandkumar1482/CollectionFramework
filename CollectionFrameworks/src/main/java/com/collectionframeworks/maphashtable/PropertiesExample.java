package com.collectionframeworks.maphashtable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("file.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("username");
		System.out.println(s);
		p.setProperty("dbname", "mysql");
		p.setProperty("connection", "mysql");
		/*
		 * Enumeration e = p.propertyNames(); while (e.hasMoreElements()) { Map.Entry
		 * map = (Entry) e.nextElement(); System.out.println(map.getKey() + "  " +
		 * map.getValue()); }
		 */

		FileOutputStream fos = new FileOutputStream(new File("new.properties"));
		p.store(fos, "we can add one element");
		System.out.println(p);
		FileOutputStream fos1 = new FileOutputStream(new File("new1.properties"));
		p.storeToXML(fos1, "convert file to xml format", "UTF-8");
		System.out.println(p);

	}
}
