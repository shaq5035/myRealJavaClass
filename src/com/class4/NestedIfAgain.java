package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {

		double gpa=3.4;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulation on your dipoloma");
			if(gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("But sorry we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
		}
		
	}

}
