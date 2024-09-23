package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer();
		customer.firstName = "Zeynep";
		customer.lastName = "Seratlı";
		customer.age= 20;
		customer.id = 98765432;
		customer.email = " birisi@hotmail.com ";
		
		customer.yaz();
		
		System.err.println("----------------------------------------------");
		
		Employee employee = new Employee();
		employee.firstName = "Elif";
		employee.lastName = "Seratlı";
		employee.age = 42;
		employee.id = 980706;
		employee.salary = 9500;
		
		employee.yaz2();
		
		
	}

}
