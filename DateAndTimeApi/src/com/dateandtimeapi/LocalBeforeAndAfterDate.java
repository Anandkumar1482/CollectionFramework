package com.dateandtimeapi;

import java.time.LocalDateTime;

public class LocalBeforeAndAfterDate {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1995, 06, 20, 4, 20);
		System.out.println(dt);

		System.out.println("After Six Months :" + dt.plusMonths(6));
		System.out.println("Before Six Months :" + dt.minusMonths(3));
		System.out.println("Before 7 days :"+dt.minusDays(7));
	}
}
