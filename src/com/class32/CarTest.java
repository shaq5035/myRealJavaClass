package com.class32;
import java.util.*;
public class CarTest {
	public static void main(String[] args) {
		//Create a map in which we will store the carNumber and Car Object itself
		
		Map<Integer, Car> carMap=new HashMap<>();
		carMap.put(1, new Car("BMW", "x8"));
		carMap.put(2, new Car("Audi", "R8"));
		carMap.put(3, new Car("Mercedes", "cls"));
		
		Collection<Car> carValues=carMap.values();
		for(Car car:carValues) {
			car.printCarDetails();
		}
	}
}
