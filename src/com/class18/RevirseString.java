package com.class18;

public class RevirseString {

	private String name="john";
	String name1="bilal";
	protected String name2="shaban";
	public String name3="weqas";
	
	public static void main(String[] args) {
		RevirseString str = new RevirseString();
		System.out.println(str.revirse("Hello"));
		System.out.println();
		
		System.out.println(str.palind("madam"));
System.out.println();
System.out.println(str.word("aint nobody tell me nothing"));	
	
		
	}
	
	protected String revirse(String word) {
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
			// task 1
		}
		return rev;
	}

	
	
	
	public boolean palind(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
		reverse += word.charAt(i); 
		}
		if (reverse.equalsIgnoreCase(word)) {
			return true;
		} else {
			return false;
		}
	
		// task 2

	}

	
	
	
	
	private String[] word(String str) {
		String []array=str.split(" ");
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		return array;

		// task 3
	}
	
	
	void sayHello() {
		System.out.println("Hello Student");
	}
}



