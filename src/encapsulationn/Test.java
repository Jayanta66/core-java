package encapsulationn;

public class Test {

	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.setId(1);
		p.setName("jay");
		p.setSsn("12345");
		
		System.out.println("ID : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("ssn : "+p.getSsn());

	}
	
}
