package com.class12;

public class StringManipulation3 {

	public static void main(String[] args) {
// charAt(); returns a character at a specified index
		System.out.println("-------charAt-------");
		String str="Students";
	char character=	str.charAt(4);
	System.out.println(character);
	
	for (int i=0;i<str.length();i++) {
		System.out.println(str.charAt(i));
	}
		//indexOf(); returns an index of specified character
		System.out.println("-------indexOf---------");
		
		String str1="Sunday";
		int index= str1.indexOf("n");
		System.out.println(index);
		
		String str2="Syntax Tech";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Tech"));
	
		//substring() gives another string from your current string
		System.out.println("------substring------");
		
		String str3="Today is sunday java class";
		String newstr=str3.substring(8);
		System.out.println(newstr);
		System.out.println(str3.substring(21));
		
		System.out.println("------substring beg index and end index------");
		str3.substring(0, 5);
		str3.substring(9, 20);
		str3.substring(16, 20);
		System.out.println(str3.substring(0, 5));
		System.out.println(str3.substring(9, 20));
		System.out.println(str3.substring(16, 20));
	}

}
