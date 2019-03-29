package com.class4;

import java.util.Scanner;

public class LoanSpecial {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		int loan;
		
		userInput = new Scanner(System.in);
		 System.out.println("Enter loan ammount");
		 
		 loan =userInput.nextInt();
		 
		 if (loan  <  200000) {
			 System.out.println("Will give loan");
		 }else {
			 System.out.println("Will not give loan");
		 }
			 
		 
	}

}
