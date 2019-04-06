package com.class16_2;

public class Task4 {

	public static void main(String[] args) {
		Task4 str=new Task4();
		str.num1();
		
	}
	void num1() {
		//Print the following pattern:
				//*
				//**
				//***
				//****
				//*****
				//****
				//***
				//**
				//*
				
				for(int a=1;a<=5;a++) {
					for(int b=1;b<=a;b++) {
						
							System.out.print("* ");
						}
							System.out.println();
						}
				for(int a=1;a<=4;a++) {
					for(int d=4;d>=a;d--) {
					System.out.print("* ");
					}
				System.out.println();
	}
}
}
		
	


