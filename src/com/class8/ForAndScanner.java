package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	private static Scanner input;

	public static void main(String[] args) {

		// prompt user to enter 2 int and compare the end print largest

		int num1, num2;

		int largest = 0;

		input = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {

			System.out.println("Please enter 2 number");
			num1 = input.nextInt();
			num2 = input.nextInt();

			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + " is equal to " + num2);
			}
			System.out.println(largest + " is the largest");
		}
	}
}