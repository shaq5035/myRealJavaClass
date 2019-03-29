package com.class9;

import java.util.Scanner;

public class BuyItem {
private static Scanner input;

//Ask user to enter the item they want to buy
//and  the price for the item. Then ask user to pay for it.
//Every time user enters money accumulate the amount and tell 
//user how much is left to pay off the amount. Whenever user done with 
//payments tell them "Thank you for shopping!"
	
	public static void main(String[] args) {

		String item;
		int pay;
		int price;
		int money;
		int total=0;
		int balance;
		int change;
		
		input = new Scanner(System.in);
		System.out.println("enter item you want to buy");
		item=input.nextLine();
		System.out.println("enter price for item");
		price=input.nextInt();
		
		do {
			System.out.println("enter payment amount");
			money=input.nextInt();
			
			total=total+money;
			balance=price-total;
			
			if(total>price) {
				change=total-price;
				System.out.println("heres your change"+change);
				break;
			}else if(total<price) {
				balance=price-total;
			System.out.println("enter more $"+balance);
			}
		}while(total!=price);
		System.out.println("thanks for shopping");
		}
		
	}


