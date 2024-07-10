package someBasic;


public class SomeBasic_b {
	

	
	static void sayHelloWorldThrice() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");

	}
	
	static void jayantaHalder() {
		System.out.println("I've created my firs veriable.");
		System.out.println("I've created my firs method.");
		System.out.println("I've created my firs loop.");
		System.out.println("I've created my firs Java.");

	}

	
	static void jayantaaHalder(int noOfTimes) {
		System.out.println("I am Jayanta Halder .");
		System.out.println(noOfTimes);

	}
	
	
	
	static void jayantaAHalder(int noOfTimes) {
		
		for(int i=1; i<=noOfTimes;i++) {
		System.out.println(noOfTimes);

		}
	}
	
	static void jayantAAHalder(int noOfTimes) {
		
		for(int i=1; i<=noOfTimes;i++) {
			System.out.println("I am Jayanta Halder .");

		}
	}
	
	static void printNumbers(int n) {
		
		for(int i=1; i<=n;i++) {
			System.out.println(i);

		}
	}
	
	static void printSquaresOfNumbers(int n) {
		
		for(int i=2; i<=n;i++) {
			System.out.println(i*i);

		}
	}
	
	static void multiplicatioNTable() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d",5,i,5*i).println();
		}
	}
	
	
	
	//method Overloading start//
	static void multiplicationTable() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d",5,i,5*i).println();
		}
	}
	
	static void multiplicationTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.printf("%d*%d=%d",n,i,n*i).println();
		}
	}
	
	//method Overloading end//
	
	//Math //
	static void sum(int number1 ,int number2) {
		int sum = number1 + number2;
		System.out.println(sum);
		
	}
	
	
	//Return type of a Method ///
	static int sumOFTwoNumbers(int number1 ,int number2) {
		int sum = number1 + number2;
		return sum;		
	}
	
	
	//Exercises 13 start ///

	static int sumOfThreeNumbers(int number1 ,int number2, int number3) {
		int sum = number1 + number2 + number3;
		return sum;		
	}	
	
	
	static int calculateThirdAngle(int angle1 ,int angle2) {
		int angle3 = 180 - ( angle1 + angle2);
		return angle3;		
	}
	
	//Exercises 13 end ///


	public static void main(String[] args) {
		
	
		System.out.println("=================================================");

		System.out.println("Exercises 11 : Create sayHelloWorldThrice and execute it .\n"
				+ "Create a method which prints four statements and execute it \n"
				+ " I've created my firs veriable.\n"
				+ "I've created my firs method.\n"
				+ "I've created my firs loop.\n"
				+ "I've created my firs Java.");
		
		
		sayHelloWorldThrice();
		System.out.println();

		jayantaHalder();
		System.out.println();

		jayantaaHalder(2);
		
		System.out.println();

		jayantaAHalder(4);
		
		System.out.println();
		jayantAAHalder(5);
		System.out.println("=================================================");

		System.out.println();
		System.out.println("Exercises 12 : Create a method - printNumbers(int n) to print numbers from 1 to n!\n"
				+ "-Create a method - printSquaresOfNumbers(int n) to print squares of numbers from 1 to n! ");

		printNumbers(5);
		
		System.out.println();
		printSquaresOfNumbers(6);
		System.out.println("=================================================");

		System.out.println();
		multiplicatioNTable();

		
		System.out.println();
		multiplicationTable();
		
		System.out.println();

		multiplicationTable(7);
		
		
		System.out.println();
		System.out.println("Sum : ");
		System.out.println("=======");

		sum(1,2);
		System.out.println();
		System.out.println("Return type of Method : ");	
		System.out.println("==========================");

		System.out.println(sumOFTwoNumbers(5,6));
	
		
		
		System.out.println();
		System.out.println("Exercises 13 : Method to return Sum of three Numbers.\n"
				+ "Give two angles , write a metod to return the third angle in triangle .\n"
				+ "Hint : Sum of angles in a triangle is 180 .");	
		System.out.println("=================================================");
		
		System.out.println(sumOfThreeNumbers(5,6,2));

		
		System.out.println(calculateThirdAngle(52,6));

	}
	


}
