package com.class17;

public class Minium {

static int MinOfValues(int [] x) {
	int min =x[0];
	for (int y:x) {
		if(y<min) {
			min=y;
		}
	}
	return min;
}
		static int MaxOfValues(int [] x) {
			int max=x[0];
			int min=x[0];
			for (int j=0; j<x.length;j++) {
				if (x[j]>=max) {
					max=x[j];
				}if (x[j]<=min) {
					min=x[j];
				}
				
			}
			return max;
		}
	}


