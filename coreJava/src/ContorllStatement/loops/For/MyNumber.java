package ContorllStatement.loops.For;

public class MyNumber {

	private int number;
	
	public MyNumber(int number) {

	this.number = number;
	}

	public boolean isprime() {
		for(int i=2; i<= number -1; i++) {
			if(number % i == 0) {
				return false;
			} 
			
		}
		return true;
	}

	public int sumUptoN() {

		int sum = 0;
		
		for(int i=1; i<= number ; i++) {	
		}
		
		return sum;
	}

	public int sumOfDivisors() {

		int sum=0;
		for(int i =2 ; i <= number -1;i++) {
			if(number % i == 0) {
				sum = sum + i;
			}
		}
		
		return 0;
	}

	public void printNumberTringle() {

		for(int i=1; i<= number; i++) {
			for(int j=1; j<= i; j++) {
				System.out.print(j+" ");			
			}
			System.out.println();

		}
		
		
	}

}
