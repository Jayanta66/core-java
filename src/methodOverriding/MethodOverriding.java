package methodOverriding;

class A{	
	void hello() {
		System.out.println("Happy to Learn.");
	}
}

public class MethodOverriding extends A {

	void hello() {
		System.out.println("Happy to Practice.");
	}	
	public static void main(String[] args) {

		MethodOverriding methodOverriding = new MethodOverriding();
		methodOverriding.hello();		
	}
	
}
