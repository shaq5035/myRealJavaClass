package reviewSession4;

public class Reverse {
	  String reverse(String first) {
	        String reverse = "";
	        for (int i = first.length() - 1; i >= 0; i--) {
	            reverse = reverse + first.charAt(i);
	        }
	        return reverse;
	    }

	    String reverse(String first, String second) {
	        String reverse = "";
	        if (first.length() == second.length()) {
	            for (int i = first.length() - 1; i >= 0; i--) {
	                reverse = reverse + first.charAt(i) + second.charAt(i);
	            }

	        } else {
	            System.out.println("strings are not same length");
	        }

	        return reverse;
	    }
}
