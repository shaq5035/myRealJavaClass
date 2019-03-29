package com.class6;

import java.util.Scanner;

public class CountryLang {

	private static Scanner input;

	public static void main(String[] args) {

		String country, lang;
		
		input = new Scanner(System.in);
		System.out.println("Please enter country");
		country=input.nextLine();
		
		switch (country) {
		
		case "Usa":
			lang="English";
			break;
		case "Pakistan":
			lang="Urdu";
			break;
		case "India":
			lang="Hindi";
			break;
		default:
			lang="unknown";
		}
		System.out.println("Your language is "+lang);
		
	}

}
