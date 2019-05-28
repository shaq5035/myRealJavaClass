package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class CarsList {
	public static void main(String[] args) {
		
	
ArrayList<String> cars=new ArrayList<String>();
cars.add("Honda");
cars.add("Audi");
cars.add("Toyuta");
cars.add("Ford");
System.out.println(cars);

System.out.println();

for(int i=0;i<cars.size();i++) {
	cars.get(i);
	
}
System.out.println(cars);
System.out.println();

for(String obj:cars) {
	System.out.println(obj);
}
System.out.println();

Iterator<String> it=cars.iterator();
while (it.hasNext()) {
	System.out.println(it.next());

}
}
	
		
}