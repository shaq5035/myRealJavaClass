package com.class33;
import java.util.*;
public class InputMismatch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		
		try{
			int num = scan.nextInt();
			System.out.println(num);
		}
		catch(InputMismatchException e) {
			System.out.println("you put the wrong thing");
		}
	}

}
