package reviewSession4;

public class Main2 {
	
		  public static void main(String[] args) {
		    Child obj=new Child();
		    obj.m1(50, 40);
		  }
		}
		class Parent {
		  int a=10;
		  int b=20;
		   public void m1(int a,int b){
		    System.out.println((a+b));
		  
		}
		}
		class Child extends Parent{
		  
		  int a=30;
		  int b=40;
		  public void m1(int a,int b){
			  this.a=a;
			  this.b=b;
		    System.out.println((a+b));
		        System.out.println((super.a+super.b));

		  }
		}

