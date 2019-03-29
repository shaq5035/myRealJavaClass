package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		//write a program to check for work eligibility
		
		int age=65;
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young");
		}else {
			System.out.println("You are eligible for work");
		if (age<retirementAge) {
			System.out.println("Go work hard");
		}else {
			System.out.println("Enjoy your life");
		}
		}
	}

}
