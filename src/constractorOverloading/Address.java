package constractorOverloading;

public class Address {
	
	int id;
	String Village;
	String City;
	String State;
	int pin;

	
	Address(int Id,String village, String city) {		
		id=Id;
		Village = village;		
		City= city;

	}
	
	
	
	Address(int Id,String village, String city,String state,int Pin) {		
		id=Id;
		Village = village;		
		City= city;
		State = state;
		pin=Pin;
	}
	
	

	
	
	
	
	
	
	void show() {
		
		System.out.println();
		System.out.println("===============================");
		System.out.println("\tA D D R E S S");
		System.out.println("===============================");
		System.out.println(" id : "+id+"\n"+" "+"Village Name : "+Village+"\n"+" "
				+"City Name : "+City+"\n"+" "+"State : "+State+"\n"+" "+"Pin : "+pin);

	}
	

	public static void main(String[] args) {

		
		Address address = new Address(1,"Barrackpore", "kolkata", "West Bengal",123456);
		Address address2 = new Address(2,"Titagar", "kolkata", "West Bengal",789456);
		Address address3 = new Address(3,"Shodpore", "kolkata");

		address.show();
		System.out.println("*******************************");
		address2.show();
		System.out.println("*******************************");
		
		address3.show();
		System.out.println("*******************************");

	}

}
