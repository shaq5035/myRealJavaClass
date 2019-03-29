package com.class11;

public class Recap {

	public static void main(String[] args) {
		// create an array of names and retrives all values from it
		
		String [] names=new String[5];
		names [0]="shaban";
		names[1]="weqas";
		names[2]="aroosa";
		names[3]="keem";
		names[4]="mama";
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		// create an array using array liter
		String [] snames= {"shaban","bilal","asha","mehmet","zaki"};
		for (int i=0; i<=snames.length-1;i++) {
			System.out.println(snames[i]);
		}
		// retrive value using: advanced for loop, for each loop, enhanced for loop
		for(String student:snames) {
			System.out.println(student);
		}
	}

}
