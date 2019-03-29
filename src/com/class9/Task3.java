package com.class9;

public class Task3 {

	public static void main(String[] args) {
//3. Print the following pattern:
		//1
		//12
		//123
		//1234
		//12345
		for(int a=1; a<=6;a++) {
			for(int b=1;b<a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			for(int y=4;y>=i;y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
