package com.dateandtimeapi;

import java.time.LocalTime;

public class CurrentTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nano = time.getNano();

		System.out.println("the current time ");
		System.out.println("the hour is " + hour + " " + min + " " + sec + " " + nano);
	System.out.printf("%d:%d:%d:%d",hour,min,sec,nano);
	}

}
