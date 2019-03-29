package com.class5;

public class LogicalOr {

	public static void main(String[] args) {

		int day=5;
		 
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("its a weekday");
		}else if (day==6 || day==7) {
			System.out.println("its a weekend");
		}else {
			System.out.println("Youre on a different planet");
		}
	}

}
