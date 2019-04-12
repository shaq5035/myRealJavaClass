package com.class19;

public class Dogs {
static String breed="Goldendoodle";
static int paws=4;
String name;
int weight;
int height;
	public static void main(String[] args) {
		Dogs dog1=new Dogs();
		Dogs dog2=new Dogs();
		Dogs dog3=new Dogs();
		//1 dog
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProperties();
		//2 dog
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProperties();
		//3 dog
		breed="Pug";
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		dog3.getDogProperties();
		
		dog1.getDogProperties();
		dog2.getDogProperties();
		System.out.println(breed);
		//3 ways of accessing static variables
//		System.out.println(breed);
//		System.out.println(Dog.breed);//by class name
//		System.out.println(dog3.breed);// by object reference--not preffered
	}
	
	public void getDogProperties() {
		System.out.println(name+" is a breed of "+breed+" and weight is "
						+weight+" and height is "+height);
	}
	}


