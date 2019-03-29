package reviewSession;

public class Time {

	public static void main(String[] args) {

		int time= 1200;
		
		
		if(time<=0700) {
			System.out.println("Good morning");
		}else if(time<=1205) {
			System.out.println("Good day");
		}else {
			System.out.println("Good evening");
		}
	}

}
