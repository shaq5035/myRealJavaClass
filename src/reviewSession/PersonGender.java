package reviewSession;

import java.util.Scanner;

public class PersonGender {

	private static Scanner input;

	public static void main(String[] args) {
		
		

		input = new Scanner(System.in);
		System.out.println("What is your name?");
		String	name= input.nextLine();
		
		System.out.println("What is your gender?");
		String gender= input.nextLine();
		
		System.out.println("What is your age?");
		int	age= input.nextInt();
		
		System.out.println("What is your number?");
		long	number= input.nextLong();
		
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Number: "+number);
		
		
		
		
		
	}
}
