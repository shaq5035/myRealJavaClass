package com.class4;

public class Mortgage {

	public static void main(String[] args) {

		double rate=4.5;
		
		int price=200000;
		
		if (rate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will consider buying");
			if(price>=200000) {
			System.out.println("I will take a loan");
			}else {
			System.out.println("I will pay cash.");
		}
	}

}
}
