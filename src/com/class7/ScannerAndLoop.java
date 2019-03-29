package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	private static Scanner input;

	public static void main(String[] args) {

		//Prompt user to ask 3 times and print "you are doing great_____"
		
		String name;
		int a=1;
		
		input = new Scanner(System.in);
		
		while(a<=3) {
			System.out.println("Enter name");
			name=input.nextLine();
			System.out.println("You are doing great "+name);
			a++;
		}
	}

}
