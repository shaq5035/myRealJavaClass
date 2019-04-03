package com.class14;

public class InterviewQNum8 {

	public static void main(String[] args) {

		int a=1;
		int b=0;
		int c=0;
		for (int i=0;i<100;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}

}
