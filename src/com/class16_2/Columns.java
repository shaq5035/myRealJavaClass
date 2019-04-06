package com.class16_2;

public class Columns {

	public static void main(String[] args) {
		Columns str=new Columns();
		str.num1();
		System.out.println();
		str.num2();
		System.out.println();
		str.num3();
	}
	
	
			
void num1() {
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
		
	}void num2(){
	

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
}void num3(){
	// make a triangle 
				//*
				//**
				//***
				//****
							
				for(int d=0; d<5;d++) {
					for (int e=0;e<d;e++) {
						System.out.print("* ");
					}
					System.out.println();
				}
}
}

