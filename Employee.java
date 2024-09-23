package inheritance;

public class Employee extends Person {

	double salary;
	
	public void yaz2() {
		System.out.println(" çalışan adı ve soyadı :" + firstName + " " + lastName);
		System.out.println(" çalışan yaşı :" + age);
		System.out.println(" çalışan id :" + id );
		System.out.println( " çalışan maaşı :" + salary);
	}
}
