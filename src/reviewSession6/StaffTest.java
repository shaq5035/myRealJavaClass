package reviewSession6;

public class StaffTest {
	 public static void main(String[] args) {
	        
	        Professor p1 = new Professor("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878);
	        Professor p2 = new Professor("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878);
	        Professor p3= new Professor("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878);

	        Secretary s1 = new Secretary("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878);
	        Secretary s2 = new Secretary("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878);

	        System.out.println("Department salary total = "+ (p1.getSalary() + p2.getSalary() + p3.getSalary() + s1.getSalary() + s2.getSalary()));
	        
	        
	    }
}
