package com.class14;

public class StringEqualsA {

	public static void main(String[] args) {
		String a="Is it saturday? Is it raining? Do we have Java Class today?";
	String [] array=a.split("\\? ");
	System.out.println(array.length);
	for(String newO:array) {
		System.out.println(newO);
	}
	}

}
