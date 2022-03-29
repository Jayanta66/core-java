package encapsulation;

public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setFirstName("Vijay");
		c.setLastName("Biswas");
		c.setCreditCard("123456");
		
		System.out.println("First Name : "+c.getFirstName());
		System.out.println("Last Name : "+c.getLastName());
		System.out.println("Credit Card Numver : "+c.getCreditCard());
	}

}


