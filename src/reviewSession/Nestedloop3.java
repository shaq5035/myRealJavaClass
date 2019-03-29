package reviewSession;

public class Nestedloop3 {

	public static void main(String[] args) {
		//....1
		//...2
		//.4
		//5
		
		for(int a=1;a<=5;a++) {
			for (int i = 1; i<=5-a; i++) {
				System.out.print(".");
			
		
			}
			System.out.println(a);
		}
	}

}
