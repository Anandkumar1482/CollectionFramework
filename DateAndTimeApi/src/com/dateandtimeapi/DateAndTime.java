package com.dateandtimeapi;

import java.time.LocalDateTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDateTime timeanddate = LocalDateTime.now();
		System.out.println(timeanddate);
		int dd = timeanddate.getDayOfMonth();
		int mm = timeanddate.getMonthValue();
		int yy = timeanddate.getYear();
		System.out.printf("Date :" + "%d:%d:%d", dd, mm, yy);
		System.out.println("\n**************************************");
		int h = timeanddate.getHour();
		int m = timeanddate.getMinute();
		int s = timeanddate.getSecond();
		int n = timeanddate.getNano();
		System.out.printf("Time :" + "%d:%d:%d:%d", h, m, s, n);
	}
}
