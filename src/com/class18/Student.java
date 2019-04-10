package com.class18;

public class Student {

	public static void main(String[] args) {
		Student str=new Student();
		
		System.out.println("Student grade is: "+str.getGrade(90));
	}
	char getGrade (int score) {
		char grade;
		
		if (score>90) {
			 grade='A';
		}else if (score>80) {
			 grade='B';
		}else if(score>70) {
			 grade='C';
		}else if(score>50) {
			 grade='D';
		}else {
			 grade='F';
		}
		return grade;
	}

}
