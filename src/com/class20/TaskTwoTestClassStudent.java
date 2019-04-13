package com.class20;

public class TaskTwoTestClassStudent {
	/*
	 * Student student1=new Student("shaban", 90,90,90);
	 * student1.getAverage();
	 */

	public static void main(String[] args) {
		TaskTwoClassStudent obj= new TaskTwoClassStudent("Shaban haq");
		System.out.println(obj.findAvarage(80, 90, 95));
		
		TaskTwoClassStudent obj1= new TaskTwoClassStudent("Bilal khan");
		System.out.println(obj1.findAvarage(80, 90, 95));
		
		TaskTwoClassStudent obj2= new TaskTwoClassStudent("Asha noman");
		System.out.println(obj2.findAvarage(80, 90, 95));
		
		TaskTwoClassStudent obj3= new TaskTwoClassStudent("Weqas haq");
		System.out.println(obj3.findAvarage(80, 90, 95));
		
		TaskTwoClassStudent obj4= new TaskTwoClassStudent("Waqem haq");
		System.out.println(obj4.findAvarage(80, 90, 95));
		
		TaskTwoClassStudent obj5= new TaskTwoClassStudent("its ya boi");
		System.out.println(obj5.findAvarage(80, 90, 95));
	}

}
