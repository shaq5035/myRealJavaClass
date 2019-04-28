package com.class24;

public class BankTest {

	public static void main(String[] args) {
		Bank bk=new BankA();
		System.out.println("Bank A Blance is : "+bk.getBalance());
		
		Bank bk1=new BankB();
		System.out.println("Bank B Blance is : "+bk1.getBalance());
		
		Bank bk2=new BankC();
		System.out.println("Bank C Blance is : "+bk2.getBalance());
	}

}
