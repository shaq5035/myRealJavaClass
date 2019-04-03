package com.class14;

public class InterviewQNum2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 6, 7, 4, 3, 2 };
		int largest = array[0];
		int sLargest = array[0];
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {//another for(int a:arr)
			if (largest < array[i]) {
				sLargest = largest;
				largest = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.out.println(sLargest);
		System.out.println(largest);
		System.out.println(smallest);
		
		/*int arr[] = { 144, 46, 1, 86, 292, 2 };
        
        int min = arr[0];//0
        int secondLargest = arr[0];//0
        int largest = arr[0];//0
        
        for(int a: arr) {
            if(a>largest) {
                largest =a;
            }
            if(a < min) {
                min = a;
            }
        }
        for(int a : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println(“min = ” + min);
        System.out.println(“Second Largest = ” + secondLargest);
        System.out.println(“Largest = ” + largest);
*/
	}
}
