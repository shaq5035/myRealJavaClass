package com.class16_1;
import java.util.Scanner;
public class ScannerMethod {


	public static void main(String[] args) {
		ScannerMethod str=new ScannerMethod();
		
		Scanner in= new Scanner(System.in);
		int a =in.nextInt();
		int b=in.nextInt();
		System.out.println(str.sum(a, b));
		
	}int sum(int x, int y){
		
		System.out.println(x+y);
		
		return x+y;
		
	}
	void sub() {
		int a=10, b=12;
		System.out.println(a+b);
	}

}
