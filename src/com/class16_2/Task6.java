package com.class16_2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Task6 str = new Task6();
		str.num1();
	}

	void num1() {
		int year;

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("please enter a guessed leap year");
			year = input.nextInt();

			if (year % 400 == 0) {
				System.out.println("Year is a leap year");
				break;
			} else if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("year is a leap year");
				break;
			} else {
				System.out.println("year is not a leap year");
			}
		}
	}

}
