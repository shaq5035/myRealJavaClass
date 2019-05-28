package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList {

	public static void main(String[] args) {
ArrayList<Integer> num=new ArrayList<Integer>();

for(int i=1;i<=50;i++) {

	if(i%2==0) {
		num.add(i);
	}
}
Iterator<Integer> it=num.iterator();

while(it.hasNext()) {
    int number=it.next();
    
    if(number%5==0) {
    	it.remove();
    }
}
System.out.println(num);
}
	}


