package javaTutorials;

public class DogClass {
	String breed,name,color;
	  public static void main(String[]args){
	    
	    DogClass dog=new DogClass();
	    dog.breed="Husky";
	    dog.name="Rocky";
	    dog.color="Black and White";
	    dog.bark();
	    dog.run();
	    dog.play();
	    
	    DogClass dog1=new DogClass();
	    dog1.breed="Bulldog";
	    dog1.name="Zuse";
	    dog1.color="Gray";
	   dog1.bark();
	    dog1.run();
	    dog1.play();
	    
	     DogClass dog2=new DogClass();
	    dog2.breed="Labrador";
	    dog2.name="Jessi";
	    dog2.color="Gold";
	    dog2.bark();
	    dog2.run();
	    dog2.play();
	  }
	  void bark(){
	    System.out.println(breed+" can bark");
	  }
	  void run(){
	    System.out.println(breed+" can run");
	  }
	  void play(){
	    System.out.println(breed+" can play");
	  }
	}


