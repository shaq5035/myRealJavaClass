package pratice;

public class sleepin {

	public static void main(String[] args) {
/*The parameter weekday is true if it is a weekday,
 *  and the parameter vacation is true if we are on vacation. 
 *  We sleep in if it is not a weekday or we're on vacation. 
 *  Return true if we sleep in. */
		boolean weekday=true;
		boolean vacation=false;
		
		if(weekday && vacation ) {
			System.out.println("we are going on vaction");
			}else if(weekday || vacation) {
				System.out.println("we sleep in");
			}
		}
	}


