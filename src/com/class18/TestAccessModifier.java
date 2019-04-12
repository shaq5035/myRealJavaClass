package com.class18;

public class TestAccessModifier {

	public static void main(String[] args) {
		RevirseString obj=new RevirseString();
		
		obj.palind("madam");//public
		obj.revirse("lol smeily");//protected
		obj.sayHello();///default
		
		System.out.println(obj.name1);// accessing default variable
		System.out.println(obj.name2);;// accessing protected variable
		System.out.println(obj.name3);;// accessing public variable
	}

}
