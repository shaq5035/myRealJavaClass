package com.class11;

public class RetrivingAllValues {
	public static void main(String[] args) {
		
		int[][]num= {
				
				{1,2,3,4},
				{2,4,6},
				{3,6,9,12},
		};
//		int rows=num.length;
//		System.out.println(rows);
//		
//		int col=num[0].length;
//		System.out.println(col);
		
		for(int row=0; row<num.length;row++) {
			
			for(int col=0; col<num[row].length;col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
	}

}
