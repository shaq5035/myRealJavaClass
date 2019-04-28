package reviewSession5;

public class MainSuper{
	String name="shaban";
	int a=69;
	boolean aa=true;
	
	MainSuper(int a){
		System.out.println("This is parent with 1 parameter "+a);
	}
	MainSuper(int a, int b){
		System.out.println("This is parent with 2 parameter "+a+" "+b);
	}
}
class ChildSuper extends MainSuper{
	String name="Keem";
	int a=45;
	boolean aa=false;
	
	void first() {
		System.out.println(super.name+" "+super.a+" "+super.aa);
		System.out.println(name+" "+a+" "+aa);

	}
	ChildSuper(int a) {
		super(a);
		System.out.println("This is child with 1 parameter "+a);

	}
	ChildSuper(int a, int b) {
		super(a,b);
		System.out.println("This is child with 2 parameter "+a+" "+b);

}
}
