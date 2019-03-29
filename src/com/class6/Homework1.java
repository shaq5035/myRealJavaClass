package com.class6;

import java.util.Scanner;

public class Homework1 {

	private static Scanner input;

	public static void main(String[] args) {
		double num1, num2,num3;
		
		input = new Scanner(System.in);
		System.out.println("Please enter 3 distinct double values");
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1+ "is the largest");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+ " is the largest");
		}else {
			System.out.println("invalid");
		}
	}

}
