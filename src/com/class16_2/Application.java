package com.class16_2;

import com.class16.Calculator;

public class Application {

	public static void main(String[] args) {
	// initial     obj   constructor     and the whole thing is instantiate 
		Calculator str = new Calculator();
		str.add(15, 10);
		str.sub(20, 9);
		str.div(15, 5);
		str.mult(100, 100);
	}

}
