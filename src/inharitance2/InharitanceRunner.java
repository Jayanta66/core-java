package inharitance2;

public class InharitanceRunner extends parentClass{
	
	void sleep() {
		System.out.println("I am sleeping after dinner .");
	}

	public static void main(String[] args) {

		InharitanceRunner c = new InharitanceRunner();
		c.eat();
		c.sleep();
		
	}

}
