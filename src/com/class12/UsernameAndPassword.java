package com.class12;

import java.util.Scanner;

public class UsernameAndPassword {
	public static void main(String[] args) {

		String userN, password, confirm;
		String renter, enter, match;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Username");
		userN = input.nextLine();
		System.out.println("Enter password");

		password = input.nextLine();
		System.out.println("Enter confirm password");

		confirm = input.nextLine();

		if (userN.isEmpty() && password.isEmpty() && confirm.isEmpty()) {
			System.out.println("Username and pssword cannot be empty");

		} else {
			int length = password.length();
			if (length < 8) {
				System.out.println("Password is too short”");
				while (length > 8) {
				}
				System.out.println("Please enter a password more than 8 character");
				renter = input.nextLine();
			} else {
				if (password.contains(userN)) {
					System.out.println("Password cannot contain Username ");
					while (!password.contains(userN)) {

					}
					System.out.println("Please enter a password that doesnt contain Username");
					enter = input.nextLine();
				} else if (password.equals(confirm)) {
					System.out.println("Your username and password has been created");

				} else {
					System.out.println("Passwords do not match");
					while (password.equals(confirm)) {

					}
					System.out.println("Enter password that matches with confirm password");
					match = input.nextLine();
				}

			}

		}

	}
}
