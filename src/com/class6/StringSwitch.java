package com.class6;

import java.util.Scanner;

public class StringSwitch {

	private static Scanner input;

	public static void main(String[] args) {
		
		String country;
		String favFood;
		
		input = new Scanner(System.in);
		System.out.println("Please enter country");
		country=input.nextLine();
		
		switch (country) {
		
		case "Usa":
			favFood= "burger";
			break;
		case "Russia":
			favFood= "pelmeni";
			break;
		case "Pakistan":
			favFood="biryani";
			break;
		default:
			favFood="Unknown";
			}
		System.out.println("Your favorite food is "+favFood);
	}

}
