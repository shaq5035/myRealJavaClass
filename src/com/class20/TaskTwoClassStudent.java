package com.class20;

public class TaskTwoClassStudent {
/*
 * public String studentName;
 * public int  grade1,grade2,grade3;
 * 
 * 
 *public Student(String name, int a,int b,int c){
 *StudentName=name;
 *grade1=a;
 *grade2=b;
 *grade3=b;
 *}
 * 
 * public void getAverage(){
 * int average=(grade1+grade2+grade3)/3
 * system.out.println("my name is "+name+"and my average is "+average)
 * }
 */


TaskTwoClassStudent(String name){
	System.out.print("My name is "+name+" and my average is ");
}

public int findAvarage(int a, int b,int c){
	return (a+b+c)/3;
}
}
