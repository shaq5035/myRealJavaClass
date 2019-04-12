package com.class19;

public class LocalVarable {

	public static void main(String[] args) {

		String name="john";
		//System.out.println(name);
		
		LocalVarable obj=new LocalVarable();
		
		obj.hello(name);
		System.out.println(name);
	}
	public void hello(String name) {
		name="jack";
		System.out.println("Hello "+name);
	}

}
