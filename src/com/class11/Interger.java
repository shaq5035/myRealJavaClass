package com.class11;

public class Interger {

	public static void main(String[] args) {

		int sum=0;
		int []num= {1,2,3,4,5,6,7,8};
		for(int i=0; i<num.length;i++) {
			sum=sum+num[i];
			
		}
		System.out.print(sum);
		System.out.println();
	
		int add=0;
		for(int numbers:num) {
			add=add+numbers;
		}
		
		System.out.print(add);
	}

}

