package com.class4;

import java.util.Scanner;

public class CityAndTemp {

	private static Scanner userScanner;

	public static void main(String[] args) {
		// ask user to enter city and temperature in fahrenheit 
		// your program should convert F--->C
		// your program should say "the temperature in the city____is___"
		
		String cityName;
		int temp;
		
		userScanner = new Scanner(System.in);
		System.out.println("Please enter your city");
		
		cityName=userScanner.nextLine();
		
		System.out.println("Please enter temperature in Fahrenheit");
		
		temp=userScanner.nextInt();
		// formula (F-32)x 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temperture in the city "+cityName+" is "+convertedTemp+" Celsius");
		
		
		
	}

}
