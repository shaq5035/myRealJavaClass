package com.class14;

class InterviewQNum3 {

	public static void main(String[] args) {

		String	str="12Hello 3212World 2131%@";
		String replacenNoNum=str.replaceAll("[0-9]", "");
		System.out.println(replacenNoNum);
		
		String newString=replacenNoNum.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString);
		
		String str2="hello";
		System.out.println(str2.length());
	}

}
