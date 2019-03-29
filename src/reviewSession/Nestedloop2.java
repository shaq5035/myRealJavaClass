package reviewSession;

public class Nestedloop2 {

	public static void main(String[] args) {

		//....1
		//...22
		//..333
		//.4444
		//55555
		
		for(int a=1;a<=5;a++) {
			for (int i = 1; i<=5-a; i++) {
				System.out.print(".");
			}

			for(int b=1;b<=a;b++) {
		
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
