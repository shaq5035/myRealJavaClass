package com.class11;

public class Country {

	public static void main(String[] args) {

		String[] country= {"USA","Pakistan","Japan"};
		for(int i=0; i<country.length;i++) {
			System.out.println(country);
		if(country[i].equals("USA")){
				System.out.println("Washington");
			}else if(country[i].equals("Pakistan")) {
				System.out.println("islamabad");
			}else if(country[i].equals("Japan")) {
				System.out.println("Tyko");
			}
		}
		String[] countrys= {"USA","Pakistan","Japan"};
		for (String count:countrys) {
			switch(count) {
			case "USA":
				System.out.println("Washington");
				break;
			case "Pakistan":
				System.out.println("islamabad");
				break;
			case "Japan":
				System.out.println("Toko");
					break;
			}
		}
	}

}
