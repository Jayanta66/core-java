package exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c;
		try {
		System.out.println("Enter two numbers");
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Result : "+c);
		
		}catch(ArithmeticException e) {
			System.out.println("please do not enter 0");

		}finally {
			System.out.println("finally");

		}
		System.out.println("More code can go here");
		
	}

}
