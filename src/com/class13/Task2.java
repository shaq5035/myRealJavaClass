package com.class13;

public class Task2 {

	public static void main(String[] args) {
String day=new String("Thursday!");
if (!day.isEmpty()) {
	if (day.length()%2!=0 && day.length()>=3) {
		System.out.println(day.charAt(day.length()/2));
	}
}
	}

}
