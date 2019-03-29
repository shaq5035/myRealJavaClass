package com.class12;

public class Grocery {

	public static void main(String[] args) {
		//one way
		String [][]groc={
				{ "banana", "apple","pears"},
				{"carrots","peppers","corn"},
				{"milk","cheese","butter"},
			
		};
		for(String[] food:groc) {
			for(String store :food) {
				System.out.print(store+" ");
			}
			System.out.println();
		}
		// another way
		for(int i=0; i<groc.length;i++) {
			for(int j=0; j<groc[i].length;j++) {
				System.out.print(groc[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
