package com.class4;

import java.util.Scanner;

public class Dmv {

	private static Scanner userInput;

	public static void main(String[] args) {

		int age;
		userInput = new Scanner(System.in);
		System.out.println("Enter age");
		
		age =userInput.nextInt();
		
		if (age>=18) {
			System.out.println("I will issue Driver Licence");
		}else {
			System.out.println("Offer Leaners Permit");
		}
	}

}
