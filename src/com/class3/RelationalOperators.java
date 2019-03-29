package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {

		
		int a=198;
		int b=198;
		boolean result= a>b;
		boolean result1= a==b;
		System.out.println(result);
		System.out.println(result1);
		// compare 2 number and if a is larger then b ---> print
		if (a!=b) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		// declare price and if price is higher then expected price ---> i will not buy
		
		double shoePrice=32.99;
		double allowedPrice=31.99;
		 if (shoePrice <=allowedPrice) {
			 System.out.println("i am buying those shoes");
		 }else {
			 System.out.println("i am not buying those shoes");
		 }
		
	}

}
