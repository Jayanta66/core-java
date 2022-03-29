package ContorllStatement.loops.For;

public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(5);
		boolean isPrime = number.isprime();
	
		System.out.println("isPrime : "+isPrime);
	
		int sum = number.sumUptoN();
		System.out.println("SumUptoN : "+sum);
	
		
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("SumOfDivisors : "+sumOfDivisors);
	
		number.printNumberTringle();
		
	}

}
