package com.class6;

import java.util.Scanner;

public class Homework2 {

	private static Scanner scan;

	public static void main(String[] args) {

		
	        /*
	         * Program to find largest number among three numbers using nested if
	         * provided by a user (numbers must be distinct)
	         */

	        int num1, num2, num3,largest;
	        
	        scan = new Scanner(System.in);
	        
	        System.out.println("Please enter 3 distinct numbers");
	        num1=scan.nextInt();
	        num2=scan.nextInt();
	        num3=scan.nextInt();

	        if (num1>num2) {
	                    if (num1>num3) {
	                        largest=num1;
	                    }else {
	                        largest=num3;
	                    }
	        }else { //assuming num2>num1
	            
	                    if (num2>num3) {
	                        largest=num2;
	                    }else {
	                        largest=num3;
	                    }
	        }
	        
	        System.out.println("The largest number is "+largest);
	    }
	}