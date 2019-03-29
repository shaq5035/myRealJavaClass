package reviewSession;

public class Array1 {

	public static void main(String[] args) {
// Write a program to sum the values of an array
//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		int [] num= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int a=0; a<num.length;a++) {
			sum+=num[a];
			
		}
		System.out.println(sum);
				
	}

}
