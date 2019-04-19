package com.class22;

public class ThreeOverloading {
//task2 
	 static void ThreeOverloading() {
		System.out.println("Im a static method that has an empty parameter");
	}
	 static void ThreeOverloading(String word) {
		 System.out.println("Im a static method that have one parameter "+word);
	 }
	 static void ThreeOverloading(char my, String str) {
		 System.out.println("Im a static method that has 2 parameter "+my+" "+str);
	 }
}
