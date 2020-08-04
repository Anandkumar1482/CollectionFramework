package com.collectionframeworks.map;

public class Temp {
	@Override
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize method is called when the object doesn't having any reference");
	}

}
