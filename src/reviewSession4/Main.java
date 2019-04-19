package reviewSession4;

public class Main {

	static String make="unknown";
	 static String model="unknown";
	static int numberOfDoors=4;
	static  int topSpeed=90;
	 static double price=0.0;
	  
	  Main(String make,String model,int numberOfDoors,int topSpeed,double price){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	  }
	  Main(String make,String model,int topSpeed,double price){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	  }
	  Main(int numberOfDoors,int topSpeed,double price){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	    }
	    Main(String make,String model,int numberOfDoors){
	    System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	    }
		public static void main(String[] args) {
			Main obj=new Main("Toyota","Prius",4,120,30000.0);
			Main obj1=new Main("Toyota","Prius",120,30000.0);
			Main obj2=new Main(4,120,30000.0);
			Main obj3=new Main("Toyota","Prius",4);
		}
	}