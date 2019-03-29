package com.class7;

public class Task {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {
				
			if(day==6) {
				workDay=false;
				System.out.println("I dont need day off");
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}
		
	}
}
