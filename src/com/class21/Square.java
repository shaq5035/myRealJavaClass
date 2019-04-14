package com.class21;

public class Square {
	
public void rec(int a,int b) {
	System.out.println("Rectangle");
	System.out.println(a*b);
}
public void rec(int a) {
	System.out.println("Square");
	System.out.println(a*a);
}
public void rec(int a, int b, int c ) {
	System.out.println("Cube");
	System.out.println(6*(a*b*c));
}
}
