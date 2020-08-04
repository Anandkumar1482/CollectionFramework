package com.dateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DifferentZoneDateTime {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime ztd = ZonedDateTime.now(zone);
		System.out.println(ztd);

	}
}
