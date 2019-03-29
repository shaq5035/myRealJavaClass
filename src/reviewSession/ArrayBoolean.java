package reviewSession;

public class ArrayBoolean {

	public static void main(String[] args) {
boolean found=false;

		int [] num= {1,2,3,4,5,6,7,8,9,10};
		for(int a=0; a<10 ;a++) {
			if(num[a]==6) {
				found=true;
				break;
			}
		}
		if (found==true) {
			System.out.println("array contains value 6");
		}else {
			System.out.println("array did not contain value 6");
		}
		
		
		
	}

}
