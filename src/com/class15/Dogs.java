package com.class15;

public class Dogs {

	 String breed, color;
	    int year;
	    boolean angryDog;
	    
	   public static void main(String[] args) {
	       
	Dogs dog1=new Dogs();
	System.out.println("--------dog1-------");
	dog1.breed="Hasky";
	dog1.angryDog=false;
	dog1.color="Grey";
	dog1.year=3;

	dog1.bark();
	dog1.sit();
	dog1.hunt();
	
	Dogs dog2=new Dogs();
	System.out.println("--------dog2-------");

	dog2.breed="Bulldog";
	dog2.angryDog=true;
	dog2.color="Black";
	dog2.year=5;
	
	dog2.bark();
	dog2.sit();
	dog2.hunt();
	        
	Dogs dog3=new Dogs();
	System.out.println("--------dog3-------");

	dog3.breed="Labrador";
	dog3.angryDog=false;
	dog3.color="White";
	dog3.year=7;
	
	dog3.bark();
	dog3.sit();
	dog3.hunt();
	        
	    }

	    void bark() {
	        System.out.println("Woow Woof!!!");
	    }
	    void sit() {
	        System.out.println(breed+" can sit");
	    }
	    void hunt() {
	        System.out.println(breed+" can hunt");
	    }
}
