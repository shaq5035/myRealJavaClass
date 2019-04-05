package com.class16;

public class Task2EvenOrOdd {

	public static void main(String[] args) {
		Task2EvenOrOdd obj=new Task2EvenOrOdd();
		obj.odd(25);
	}
	void odd(int a) {
		if(a%2==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is odd");
		}
	}

}
