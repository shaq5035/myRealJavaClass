package com.class19;

public class InstanceVariable {
public String name="John";//instance variable can have access modifiers

	public static void main(String[] args) {
		String name="anna";
		System.out.println(name);
		System.out.println("-----Changing value of locial varable");
		name="jackie";
		System.out.println(name);
		
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.name);
		System.out.println("--Changing value of instance variable");
		obj.name="smith";
		System.out.println(obj.name);
		
		// creating second object
		InstanceVariable obj1=new InstanceVariable();
		System.out.println(obj1.name);
	}

}
