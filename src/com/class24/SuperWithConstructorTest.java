package com.class24;

public class SuperWithConstructorTest {
		String hello;
	public static void main(String[] args) {
		System.out.println("----object of child class-----");
		ChildOfSuperWithConstructor obj=new ChildOfSuperWithConstructor();
		
		SuperWithConstructorTest a=new SuperWithConstructorTest();
		a.string("anhytbibg ");
	}
	String h="hello";
	public void string(String hello) {
		this.hello=hello;//instance equals to your local
//		System.out.println(this.hello);
//		hello=this.hello;//this local variable equals instance
		System.out.println(this.hello);
	}
	
	
}
