package com.class4;

public class WorkedYears {

	public static void main(String[] args) {
		
		int year=5;
		int saly=50000;
	
		
		if (year>=5) {
			System.out.println("eligible for the bonus");
			if(saly>50000) {
				System.out.println("bonus = 5000 ");
			} else {
				System.out.println("bonus= 3000");
			}
		}else {
			System.out.println("not eligible");
		}
		
	}

}
