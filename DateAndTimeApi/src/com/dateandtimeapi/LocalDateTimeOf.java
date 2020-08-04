package com.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeOf {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1996, Month.JUNE, 20, 5, 45, 44);
		System.out.println(dt);
	}
}
