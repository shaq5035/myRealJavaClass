package com.class15;

public class Car {
	
	String make,model,color;
	int door,wheel;
	
	public static void main(String[] args) {
		
	//Classname variable=new ClassName();
		
		// 1 object
		System.out.println("---------1st object---------");
		Car car1= new Car();
		car1.make="Honda";
		car1.model="civic";
		car1.color="black";
		car1.door=4;
		car1.wheel=5;
		System.out.println("Car "+car1.make+" has "+car1.wheel+" wheels");
		// define behaiour 
		car1.drive();
		car1.reverse();
		car1.brake();
		
		//2 object
		System.out.println("---------2nd object---------");
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheel=4;
		car2.drive();
		car2.brake();
		car2.reverse();
	}
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	void brake() {
		System.out.println("Car can brake");
	}
}
