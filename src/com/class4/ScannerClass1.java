package com.class4;

import java.util.Scanner;

public class ScannerClass1 {

	private static Scanner imput;

	public static void main(String[] args) {
		// ask user for the name and print good morning_
		
		imput = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=imput.nextLine();
		
		System.out.println("Good morning "+name);
	}

}
