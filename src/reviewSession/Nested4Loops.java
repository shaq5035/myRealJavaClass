package reviewSession;

public class Nested4Loops {

	public static void main(String[] args) {
//		Write a program that prints the following pattern
//							1 2 3 4 5 6 7 8 9 10
//		                    2 4 6 8 10 12 14 16 18 20
//		                    3 6 9 12 15 18 21 24 27 30
//		                    4 8 12 16 20 24 28 32 36 40
//		                    5 10 15 20 25 30 35 40 45 50
	// one way
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
			
		}
		System.out.println();
			for (int b = 2; b <= 20; b += 2) {
				System.out.print(b + " ");
				
			}
			System.out.println();
				for (int c = 3; c <= 30; c += 3) {
					System.out.print(c + " ");
					
				}
				System.out.println();
					for (int d = 4; d <= 40; d += 4) {
						System.out.print(d + " ");
						
					}
					System.out.println();
						for (int f = 5; f <= 50; f += 5) {
							System.out.print(f + " ");
							
						}
	System.out.println();
		
		
		/////////////////////////////////////////////////////
						// another way main way
	for(int i=1;i<=5;i++) {
		for(int y=1; y<=10;y++) {
			System.out.print(i*y+ " ");
		}
		System.out.println();
	}
}
}
