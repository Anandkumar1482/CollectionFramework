package com.collectionframeworks.set;

import java.util.Random;
import java.util.Scanner;

public class RandomNUmbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		Random random = new Random();
		for (int i = 0; i < a; i++) {
			System.out.println(random);
		}
	}
}
