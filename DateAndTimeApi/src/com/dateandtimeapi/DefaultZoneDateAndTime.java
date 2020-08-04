package com.dateandtimeapi;

import java.time.ZoneId;

public class DefaultZoneDateAndTime {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

	}
}
