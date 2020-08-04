package com.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeAndDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		int d = date.getDayOfMonth();
		System.out.println(d);

		int m = date.getMonthValue();
		System.out.println(m);

		int y = date.getYear();
		System.out.println(y);

		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
