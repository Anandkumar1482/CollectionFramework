package com.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimePeriod {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1996, 8, 14);
		LocalDate today = LocalDate.now();
		Period P = Period.between(birthday, today);
		System.out.printf("age is %d years  %d months %d days", P.getYears(), P.getMonths(), P.getDays());

		LocalDate deathday = LocalDate.of(1996 + 50, 8, 14);
		Period p1 = Period.between(today, deathday);
		int days = p1.getMonths() * 367 + p1.getMonths() * 30 + p1.getDays();
		System.out.println(" \nYou are Living This Days Only!!!!! "+days);
	}

}
