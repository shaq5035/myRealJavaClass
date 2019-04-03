package com.class14;

public class InterviewQNum4 {

	public static void main(String[] args) {

		/*how to make a string from a string?
		by using a substring
		what is a substring?
		String substring(int indexNum):
		Returns a string containing all the
		characters existing from indexNum to 
		the end in the given string.*/
		
		String str="Hello its me";
		String [] lol= str.split(" ");
		System.out.println(lol.length);
		for(String ha:lol) {
			System.out.println(ha);
		}
			
	}

}
