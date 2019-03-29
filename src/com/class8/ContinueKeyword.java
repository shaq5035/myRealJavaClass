package com.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
// print num from 1 to 20 but skip those that are divisible by 3
		
		for (int i=1; i<20; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
