package com.class14;

public class CombinOfLetter {

	public static void main(String[] args) {

		String str ="E@gles123%";
		String task2=str.replaceAll("[^A-Z a-z]", "");
		System.out.println(task2.length());
		System.out.println(task2);
		
	}

}
