package com.class5;

import java.util.Scanner;

public class peoplesHeights {

	private static Scanner input;

	public static void main(String[] args) {

		double feet;
		input = new Scanner(System.in);
		System.out.println("Enter height");
		feet= input.nextDouble();
		
		if (feet <= 5 ) {
			System.out.println("short");
		}else if (feet>=5 && feet<=6) {
			System.out.println("medium");
		}else if (feet>6 ) {
			System.out.println("tall");
		}else {
			System.out.println("what are you?");
			
		}
	}

}
