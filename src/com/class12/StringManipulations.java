package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
		//length function/or method -return number of character of string
		String str="Hello";
		
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Eagles all day";
		int lengthOfThat=str1.length();
		System.out.println(lengthOfThat);
		
		//toUpperCase();convert all charater to uppercase
		//toLowerCase();convers all character to lowercase
		String str3= "Burger";
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lower=newString.toLowerCase();
		System.out.println(lower);
		
		//equals() compares 2 string, if strings are equal its true else it will be false
		String str4="Amazon";
		String str5="amazon";
		boolean equality=str4.equals(str5);
		System.out.println(equality);
		
		//equalsIgnoreCase() compares 2 string but ignores case
		String expectedBroswer="Chrome";
		String actualBrowser="chrome";
		
	boolean equals=expectedBroswer.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);
	}

}
