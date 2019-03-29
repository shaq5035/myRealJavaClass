package reviewSession2;

public class TaskString {

	public static void main(java.lang.String[] args) {
		String para="The quick brown fox jumps over the lazy dog.";
		System.out.println(para.toLowerCase());
	    System.out.println(para.toUpperCase());
	    if(para.startsWith("The")&&para.endsWith("The"))System.out.println(true);
	    
	    int sum=0;
	    if(para.contains("a")) {
	        sum++;
	        }
	    System.out.println(sum);
	    
	    System.out.println(para.substring(21));
	    System.out.println(para.substring(10, 20));
	    System.out.println(para.trim());
	}

}
