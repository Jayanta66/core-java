package controllStatement.ifElse.weekdays;

import java.util.Scanner;

public class Weakdays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int i= sc.nextInt();
		
	//	int i = 1;
		
		if( i==1) {
			System.out.println("ONE");
		}else if(i==2) {
			System.out.println("Two");

		}else if(i==3) {
			System.out.println("Three");

		}else if(i==4) {
			System.out.println("Four");

		}else if(i==5) {
			System.out.println("Five");

		}else if(i==6) {
			System.out.println("Six");

		}else if(i==7) {
			System.out.println("Seven");

		}else {
			
			System.out.println("Error");
		}
		
		
		
	}

}
