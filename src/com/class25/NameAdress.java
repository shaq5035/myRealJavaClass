package com.class25;

public class NameAdress {
String name, address;

public NameAdress(String name, String address) {
	this.name=name;
	this.address=address;
}
public void displayInfo() {
	System.out.println("My name is "+name+ " and my address is "+ address);
}
public static void main(String[] args) {
	NameAdress obj=new NameAdress("Shaban haq","blah blah blah");
	obj.displayInfo();
}
}
/*
 * 1. Write program as a student class  that has instance 
 * variables name and address. Create a constructor that will
 *  initialize those variables. Print name & address of given 
 *   student by the displayInfo method.
 * 
 * 
 */
