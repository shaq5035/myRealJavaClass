package com.class16_1;

public class CarMiles {

	public static void main(String[] args) {
		CarMiles str=new CarMiles();
		str.car();

	}
	void car() {
		for(int a=0; a<=9; a++) {
			for(int b=0; b<=9;b++) {
				for(int c=0; c<=9;c++) {
					for(int d=0; d<=9;d++) {
						System.out.println(a+""+b+""+c+""+d);
					}	
						
				}
			}
		}
	}

}
