package com.class18;

public class Task {

	public static void main(String[] args) {
		Task str = new Task();
	String email= str.createEmail("Shaban", "Haq", "gmail");
	System.out.println(email);
	}

	String createEmail(String fname, String lname, String emailType) {
		
		String email = fname+lname+"@"+emailType+".com";
		return email.toLowerCase();
	}

}
