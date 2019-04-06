package com.class16_1;

public class NestedLoopDemo {

	public static void main(String[] args) {
		NestedLoopDemo str=new NestedLoopDemo();
		str.printNum();
	}

	void printNum() {
		for (int i = 1; i <= 2; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
