package com.class4;

import java.util.Scanner;

public class ScannerClass {

private static Scanner scanner;

public static void main(String[] args) {
	// take an number from a user and print that number
	

	scanner = new Scanner(System.in);
	System.out.println("Please enter any number");
	int myNumber=scanner.nextInt();
	
	System.out.println("The number you entered is "+myNumber);
}
	

}
