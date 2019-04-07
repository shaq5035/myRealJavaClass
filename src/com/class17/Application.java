package com.class17;

public class Application {

	public static void main(String[] args) {
		System.out.println("First animal");

		Animal str = new Animal();
		System.out.println(str.age);
		System.out.println(str.weight);
		System.out.println(str.breed);
		System.out.println(str.name);

		System.out.println();
		System.out.println("Second animal");
		Animal str2 = new Animal();
		str2.breed = "parakeet";
		str2.weight = 5;
		str2.age = 2;

		System.out.println(str2.age);
		System.out.println(str2.weight);
		System.out.println(str2.breed);
		System.out.println(str2.name);

		System.out.println();
		System.out.println("Third animal");

		Animal str3 = new Animal();
		str3.breed = "persian";
		str3.weight = 10;
		str3.age = 8;

		System.out.println(str3.age);
		System.out.println(str3.weight);
		System.out.println(str3.breed);
		System.out.println(str3.name);

		System.out.println();
		
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Printing min value");
		System.out.println(	Minium.MinOfValues(my_array));
		System.out.println();
		
		 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		 System.out.println("Printing max");
		 System.out.println(Minium.MaxOfValues(array));
		 	}
		
	}


