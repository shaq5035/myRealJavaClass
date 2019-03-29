package com.class8;

import java.util.Scanner;

public class HomeWork {

	private static Scanner input;

	public static void main(String[] args) {
		
		double price;
		input = new Scanner(System.in);
		
		do {
			System.out.println("Please pay for soda");
			price=input.nextDouble();
			
		}while(price!=1.99);
		System.out.println("Please enjoy soda");
		
	}
}
