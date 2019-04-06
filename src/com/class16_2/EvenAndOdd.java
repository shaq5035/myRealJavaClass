package com.class16_2;

import java.util.Scanner;

public class EvenAndOdd {

	private static Scanner input;

	public static void main(String[] args) {
		EvenAndOdd str=new EvenAndOdd();
		str.num1();
}
	void num1() {
		int num1,num2,i;
		int sum1=0;
		int sum2=0;
		input = new Scanner(System.in);
		System.out.println("Enter start and end number");
		num1=input.nextInt();
		num2=input.nextInt();
		
		
		if (num1<num2) {
		for(i=num1;i<num2;i++) {
			if(i%2==0) {
			sum1=num1+i;
			}else {
				sum2=num2+i;
			}
			
		}
		System.out.println("sum of even num is "+sum1);
		System.out.println("sum of odd num is "+sum2);
	}

	}
}