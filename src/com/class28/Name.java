package com.class28;

import java.util.ArrayList;

public class Name {
public static void main(String[] args) {
	ArrayList<String>name=new ArrayList<String>();
	name.add("bob");
	name.add("bilal");
	name.add("asha");
	name.add("keem");
	name.add("qas");
	
	System.out.println(name.isEmpty());
	System.out.println(name.contains("Shaban"));
	System.out.println(name.size());
	if (name.isEmpty()) {
		System.out.println("The array has empty value");
		if(name.contains(name)) {
			System.out.println("Has what you are looking for");
		}else {
			
		}
	}else {
		
	}
	for(String hello:name) {
		System.out.println(hello);
	}
}
}
