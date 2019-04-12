package com.class19;

public class Employee {
	String eId;
	int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		Employee num1= new Employee();
		Employee num2=new Employee();
		
		num1.eId="Shaban";
		num1.salary=100000;
		
		num2.eId="Bilal";
		num2.salary=1;
		
		num1.object();
		num2.object();
	}
void object() {
	System.out.println("Name is "+eId+" salary is "+salary+" Dollars and CEO is "+CEO);
}
}
