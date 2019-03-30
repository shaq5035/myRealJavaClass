package com.class13;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		String momN,dadN,gend,babyN;
Scanner input= new Scanner(System.in);
System.out.println("Please enter moms name");
momN=input.nextLine();

System.out.println("Please dads name");
dadN=input.nextLine();

System.out.println("Please enter gender");
gend=input.nextLine();

if(gend.equalsIgnoreCase("boy")) {
	babyN=dadN.substring(0, dadN.length()/2);
	momN.substring(momN.length()/2);
}else if(gend.equalsIgnoreCase("girl")) {
	babyN=momN.substring(0, momN.length()/2);
	dadN.substring(dadN.length()/2);
}else {
	babyN="no suggestion";
}
System.out.println(babyN.toUpperCase());
	}

}
