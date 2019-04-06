package com.class16;
import java.util.Scanner;
public class Task3Palindrome {
	String str;
	Scanner input=new Scanner(System.in);
	//////////////////////////
	
	public static void main(String[] args) {
		Task3Palindrome obj=new Task3Palindrome();
		obj.hello("");// 
		
		///////////////////////////
	}
	
	//void is a return type, hello - method name76

	void hello(String word) {
		 System.out.println("Enter any string");
		    
		    str=input.nextLine();
		    String reverse="";
			 char [] array= str.toCharArray();
			    for (int i=str.length()-1;i>=0;i--) {
			        reverse=reverse+array[i];
			    }
			    System.out.println(reverse);
			    if (reverse.equalsIgnoreCase(str)) {
			        System.out.println("String is polindromec ");
			    }else {
			        System.out.println("String is not polindromic");
			}
			
		}
	}


