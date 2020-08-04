package com.dateandtimeapi;

import java.time.LocalDate;

public class CurrentDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		// System.out.println(date);

		int dd = date.getDayOfMonth();
		System.out.println(dd);

		int mm = date.getMonthValue();
		System.out.println(mm);

		int yyyy = date.getYear();
		System.out.println(yyyy);

		System.out.println(dd+"-"+mm+"-" +yyyy);
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		
	}
}
