package com.class17;

import java.util.Scanner;

public class Calculator {
	int a, b, c;
	
	Scanner in = new Scanner(System.in);

	int sum(int a, int b, int c) {
		return (a + b + c);
	}

	int avarage(int a, int b, int c) {
		return (a + b + c) / 3;

	}

	int minValue(int a, int b, int c) {
		int min = a;
		if (b < a) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;
	}

	int maxValue(int a, int b, int c) {
		int max = a;
		if (b>a) {
			max=b;
		}if(c>max) {
			max=c;
		}
		return max;
	}

}
