package com.class24;

class parent {

	String hello;
	String name;
	int age;

	parent() {
		super();
		hello = "hello";
		name = "weqas";
		age = 25;
		System.out.println("no parameter parent");
	}

	parent(String a) {
		super();
		hello = "hello World";
		name = "Shaban";
		age = 21;
		System.out.println("one parameter parent " + a);

	}
}

public class WeqasSuper extends parent {
	
	String job;
	String car;
	WeqasSuper() {
		super();
		job="teacher";
		car="civic";
		System.out.println("no parameter child");

	}

	WeqasSuper(String b) {
		super("shaban ");
		job ="gym";
		car="del sol";
		System.out.println("one parameter child " + b);
	}

	public static void main(String[] args) {
		WeqasSuper a = new WeqasSuper();
		System.out.println(a.age);
		System.out.println(a.job);
		System.out.println(a.car);
		System.out.println(a.hello);
		System.out.println(a.name);



	}

}
