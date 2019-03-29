package com.class11;

public class Cars {

	public static void main(String[] args) {

		String [] cars= {"BMW","Honda","ford","audi","masda","toyta"};
		
		for(int i=0; i<=cars.length-1;i++) {
			System.out.println(cars[i]);
		}
				for(String brand:cars) {
					System.out.println(brand);
				}
		}
	}


