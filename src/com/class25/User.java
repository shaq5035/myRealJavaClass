package com.class25;

public class User {
String name;
String mobileNum;

User(String name, String mobileNum){
	this.name=name;
	this.mobileNum=mobileNum;
	
}
}
 class UserInfo extends User{

	 String userAdress;

	UserInfo(String name, String mobileNum, String userAdress) {
		super(name, mobileNum);
		this.userAdress=userAdress;
		
	}
	public void userDetails(){
		System.out.println("User name is "+name+", phone number is "+mobileNum+" and address is "+userAdress);
	}
	
	
}
 class Test{
	 public static void main(String[] args) {
		 UserInfo obj=new UserInfo("Shaban haq","1800 588 2300","blush blah blah");
		 obj.userDetails();
	}
 }
