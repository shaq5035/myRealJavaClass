package com.class6;

import java.util.Scanner;

public class GradeSwitch {

	private static Scanner input;

	public static void main(String[] args) {

		String expl ;
		char grade;
		
		input = new Scanner(System.in);
		System.out.println("Please enter grade");
		grade=input.next().charAt(0);
		
		switch (grade) {
		
		case 'A':
			expl="Excllent";
			break;
		case 'B':
			expl="Good";
			break;
		case 'C':
			expl="Average";
			break;
		case'D':
			expl="Bad";
			break;
		default:
			expl="Not Acceptable";
		}
		System.out.println("Your grade explanation is "+expl);
	}

}
