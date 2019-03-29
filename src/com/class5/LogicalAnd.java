package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	private static Scanner input;

	public static void main(String[] args) {
		
		int age;
		
		 input = new Scanner (System.in);
		 System.out.println("Please enter your age");
		age =input.nextInt();
		
		if (age>=1 && age<=3) {
			System.out.println("your a baby");
		}else if (age>=3 && age<=5) {
			System.out.println("Your a toodler");
		}else if (age>= 5 && age<= 13) {
			System.out.println("YOUR a kid");
		}else if (age>= 13 && age<= 20) {
			System.out.println("your a teen");
		}else if (age>=20 && age<= 64) {
			System.out.println("your an adult");
		}else {
			System.out.println("you are a senior");
		}
	}

}
