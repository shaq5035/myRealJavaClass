package com.class16;

public class Task1Number {

	public static void main(String[] args) {
		Task1Number obj=new Task1Number();
		obj.num(20, 40);
	}

	void num(int a, int b) {
		if (a > b) {
			System.out.println("A is larger then b");
		} else {
			System.out.println("B is larger than a");
		}
	}

}
