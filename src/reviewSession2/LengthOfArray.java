package reviewSession2;

public class LengthOfArray {

	public static void main(String[] args) {
		System.out.println("-------#2-------");
	int[][]ar= {{1,2,3},
			{4,5,6,9},
			{7,8},
			
			
	};
	for(int i=0; i<ar.length;i++) {
		for(int j=0;j<ar[i].length;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		for(int[] inn:ar) {
			for(int elements:inn) {
				System.out.print(elements);
			}
			
		}
	}System.out.println("------number 1------"); 
	for (int k=0;k<ar.length;k++) {
		System.out.println("the length of row "+ k +" = "+ ar[k].length);
	}
	for (int[] inner:ar) {
		System.out.println("the length of row "+inner.length);
	}
	System.out.println("------#3----------");
	// find avarge of row 2
						// 2 6 9 3 7
						//  1 7 9 4 8
						//  0 4 6 2 5
						//  0 1 2 3
int[][] rat = { { 2, 6, 9, 3, 7 }, 
		{ 1, 7, 9, 4, 8 }, 
		{ 0, 4, 6, 2, 5 }, 
		{ 0, 1, 2, 3 } };
int ave=0;
int sum=0;
for(int a=0;a<rat[1].length;a++) {
	sum+=rat[1][a];
	ave=sum/rat[1].length;
}System.out.println(ave);


System.out.println("-----#4-------");
////    Find the number of values above the value of 7.

int count=0;
for(int[]inner:rat) {
	for(int element:inner) {
		if(element>7) {
			count++;
		}
	}
}System.out.println(count);

System.out.println("------#5--------");
//    Print the average of values in column 3.
int aver=0;
int summ=0;
for(int row=0;row<rat.length;row++) {
	//for(int col=0;col<rat[row].length;col++) {
	
		summ+=rat[row][2];
		
	}
System.out.println(summ/rat.length);
	}


	}

	//}


