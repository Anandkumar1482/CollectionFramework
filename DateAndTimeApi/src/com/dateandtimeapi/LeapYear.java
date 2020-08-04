package com.dateandtimeapi;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year value");
		int n = sc.nextInt();
		sc.close();
		Year year = Year.of(n);
		if (year.isLeap()) {
			System.out.println("the year is leap year " + n);
		} else {
			System.out.println("the year is not leap year " + n);
		}

	}
}
