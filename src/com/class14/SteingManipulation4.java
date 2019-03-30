package com.class14;

public class SteingManipulation4 {

	public static void main(String[] args) {
		System.out.println("------replace------");
		// replace() - will replace old char/value to new char/value
		String str = "i am good tester";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);
		// what we are looking for to replace, new value. case sensitive
		String newStr1 = str.replace("good", "great");
		System.out.println(newStr1);

		String newStr2 = str.replace("tester", "gamer");
		System.out.println(newStr2);

		
		// replaceAll(); will replace all that matches specified pattern[regex];
		System.out.println("-----replaceAll-------");
	String	str1="12Hello 3212World 2131%@";
	String replacenNoNum=str1.replaceAll("[0-9]", "");
	System.out.println(replacenNoNum);
	
	String newString=replacenNoNum.replaceAll("[^A-Z a-z]", "");
	System.out.println(newString);
	
	//String replaceNoChar=replacenNoNum.replaceAll("[A-Z a-z]", "");
	//System.out.println(replaceNoChar);
	
	String str2= "1Hello123";
	String lol =str2.replaceAll("[^1-9]", "");
	System.out.println(lol);
	
	
	//toCharArray() converts string to array of characters
	System.out.println("-----toCharArray----");
	String str3="Saturday";
	char [] array=str3.toCharArray();
	for(int i=0; i<array.length;i++) {
		System.out.println(array[i]);
		for(char news:array) {
			System.out.println(news);
			System.out.println("print in revs");
	for(int j=array.length-1;j>=0;j--) {
		System.out.println(array[j]);
	}
		}
	}
	
	
	
	
	}

}
