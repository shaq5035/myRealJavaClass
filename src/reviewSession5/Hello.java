package reviewSession5;

public class Hello {

	Hello(String a){
		this("a","b");
		System.out.println("one parameter");
		
	}
	Hello(String a, String b){
		this("a","b","c");
		System.out.println("two parameter");

	}
	
	Hello(String a, String b,String c){
		System.out.println("three parameter");

	}
	public static void main(String[] args) {
		Hello obj=new Hello("a");
	}
}
