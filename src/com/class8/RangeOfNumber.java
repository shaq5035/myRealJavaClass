package com.class8;

import java.util.Scanner;

public class RangeOfNumber {

	public static void main(String[] args) {
//define a range of number to print
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int sNum=input.nextInt();
		
		System.out.println("Please enter ending number");
		int eNum=input.nextInt();
		
		if(sNum< eNum) {
		
		for(int i=sNum; i<=eNum; i++) {
			System.out.println(i);
		}
		}else {
			System.out.println("I wont run your code");
		} 
		}
	}


