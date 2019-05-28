package com.class32;

public class Person {
private String name,lastName;
private int age, salary;

public Person(String name,String lastName,int age,int salary) {
	super();
	this.name=name;
	this.lastName=lastName;
	this.age=age;
	this.salary=salary;
	
}
public void getDetail() {
	System.out.println("Name:"+name+" Last name:"+lastName+" Age:"+age+" Salary:"+salary);
}

}
