package com.class3;

public class TemperatureCheck {

	public static void main(String[] args) {
		int storeTemp=68;
		int dropTemp= 32;
		
		if (dropTemp<storeTemp) {
			System.out.println("water will freeze with temperature "+ dropTemp);
		}else {
			System.out.println("water will not freeze with temperature "+ storeTemp );
		}
		
	}

}
