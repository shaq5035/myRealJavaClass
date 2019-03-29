package com.class9;

public class Columns {
// i want to print 
//***** 4 times
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int b=1;b<=4;b++) {
			for(int c=5;c>=1;c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		// make a triangle 
		//*
		//**
		//***
		//****
					
//		for(int d=0; d<5;d++) {
//			for (int e=0;e<d;e++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// make a square
		for(int f=1;f<=4;f++) {
			
			for(int g=1;g<=6;g++) {
				if(f==1 || f==4 ||g==1 || g==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
				}
				System.out.println();
			}
	}
}
	

