package com.class9;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int secret,uNum;
		secret=13;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter any number between 1 and 20");
		do {
			
			
	            
	            uNum=input.nextInt();
	            
	            if (uNum<secret) {
	                System.out.println("Number is too small, try again");
	            }else if (uNum>secret){
	                System.out.println("Number is too large,  try again");
	            }
	        }while(secret!=uNum);
	        
	        System.out.println("Congratulations!!You got it!");
	    }
	

		}
		
	


