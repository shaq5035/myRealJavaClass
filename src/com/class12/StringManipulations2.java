package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
// contains(); checks for specific value in the string
		String str="Good morning, students";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		
		String present="Welcome, shaban";
		String needed="Welcome,";
		
		boolean flag= present.contains("Welcome,");
		System.out.println(flag);
		boolean flag1=present.toLowerCase().contains(needed);
		System.out.println(flag1);
		
		//startsWith();,endsWith(); will return true if String start/ends with
		//else false
		System.out.println("--------starts with, ends with---------");
		String str1="syntax";
	boolean start=str1.startsWith("s");
	System.out.println(start);
	
	boolean ends= str1.endsWith("x");
	System.out.println(ends);
	
	//isEmpty() if length of a string is =0 string is empty else its is no
	System.out.println("-------isEmpty-------");
	String str2="Hello";
	boolean isEmpty= str2.isEmpty();
	System.out.println(isEmpty);
	
	//concat() will concatenate 1 string to the end of another
	System.out.println("------concat------");
	String str3="Hello ";
	String str4="Shaban";
	System.out.println(str3+str4);
	System.out.println(str3.concat(str4));
	
	//trim() will remove spaces at the beginning and at the end of your string
	System.out.println("------trim-----");
	String expected="You may qualify for a multi-policy discount!";
	String actual=" You may qualify for a multi-policy discount! ";
	
	actual=actual.trim();
	System.out.println(expected.equals(actual));

	}

}
