package inheritance;

public class Customer extends Person {

	String email;
	 
	
	public void yaz() {
		System.out.println(" müşteri adı ve soyadı :" + firstName + " " + lastName);
		System.out.println(" müşteri yaşı :" + age);
		System.out.println(" müşteri id :" + id );
		System.out.println( " müşteri emaili :" + email);
	}
	
	
	
}
