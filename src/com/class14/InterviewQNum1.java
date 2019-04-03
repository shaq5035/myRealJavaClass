package com.class14;

public class InterviewQNum1 {

	public static void main(String[] args) {
		int a=4;
		int b=15;
		System.out.println("Before swapping "+a+" "+b);
		
		a=a+b;//15+4=19
		b=a-b;//19-15=4
		a=a-b;//19-4=15
		System.out.println("After swapping "+a+" "+b);
		// pt 2
		System.out.println("-----pt2-----");
		String c="hello";
		String d="bye";
		
		System.out.println("Before swapping "+c+" "+d);
		
		c=c+d;//hellobye
		d=c.substring(0,c.length()-d.length());//hello
		c= c.substring(d.length());
		
		System.out.println("After swapping "+c+" "+d);
		
		/*another way
		 * str1=str1+str2;
        str2=str1.replaceAll(str2,"");
        str1=str1.replaceAll(str2, "");*/
		
	}

}
