package com.class6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1,num2, sum = 0 ;
		char operator;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 2 values");
		num1=input.nextDouble();
		num2=input.nextDouble();
		
		System.out.println("Choose an operator from the following (+,-,/,*)");
		operator =input.next().charAt(0);
		switch (operator) {
		
		case ('+'):
			sum= (num1+num2);
			break;
		case('-'):
			sum=(num1-num2);
			break;
		case ('*'):
			sum=(num1*num2);
			break;
		case('/'):
			sum=(num1/num2);
			break;
		default:
			System.out.println("Error");
		}
		System.out.println("Your sum is "+sum);
	}
	

}
