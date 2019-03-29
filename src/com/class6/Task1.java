package com.class6;

import java.util.Scanner;

public class Task1 {

	private static Scanner input;

	public static void main(String[] args) {

		int temp;
		String activity = "";

		input = new Scanner(System.in);
		System.out.println("Please enter temperature");
		temp = input.nextInt();
		boolean rain, snow, sunny;

		if (temp >= 40 && temp < 80) {
			System.out.println("Is it raining");
			rain = input.nextBoolean();

			if (rain) {
				activity = "I will watch a movie";
			} else {
				activity = "I will go hiking";
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it snowing?");
			snow = input.nextBoolean();

			if (snow) {
				activity = "I will go snow boarding";
			} else {
				activity = "stay home";
			}

		} else if (temp > 80) {
			System.out.println("Is it sunny?");
			sunny = input.nextBoolean();

			if (sunny) {
				activity = "I will go to the beach";
			} else {
				activity = "I will code";
			}

		} else {
			System.out.println("Please enter different temp");
			activity = "unknow";
		}
		System.out.println("the activity i will be doing today is " + activity);

	}

}
