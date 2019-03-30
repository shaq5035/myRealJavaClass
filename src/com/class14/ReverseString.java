package com.class14;

public class ReverseString {

	public static void main(String[] args) {

		// reverse a string without using a reverse function
		// 1 using toCharArray();
		String org="Today is Java Class";
		String reverse="";
	char [] array=org.toCharArray();
		for (int i=array.length-1;i>=0;i--) {
			
			reverse	=reverse+array[i];
		}
		System.out.println("Reversed String #1 is: "+reverse);
		
		// 2nd way charAt();
		String reverse1="";
		
		for(int i=org.length()-1;i>=0;i--) {
			reverse1=reverse1+org.charAt(i);
		}
		System.out.println("Reversed String #2 is: "+reverse1);
		
		//substring
		String reverse2="";
		org.substring(0);
		for(int i=org.length()-1;i>=0;i--) {
			reverse2=reverse2+org.substring(i);
		}
		System.out.println("Reversed String #3 is: "+reverse2);
	}

}
