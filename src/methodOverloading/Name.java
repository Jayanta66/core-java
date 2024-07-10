package methodOverloading;

import java.util.Scanner;

public class Name {

	void name(String firstname) {
		
		System.out.println(firstname);
	
	}
	
	void name(int midname) {	
		System.out.println(midname);
	}
	

	void name(float lastname) {
		
		System.out.println(lastname);	
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		Name nm = new Name();
		
		System.out.printf("Enter your firstname : ");
		String firstname=sc.next();
		nm.name(firstname);
				
		
		Scanner scan = new Scanner(System.in);		
		System.out.printf("\nEnter your middlename (Optional) : ");
		String midname=scan.nextLine();
		nm.name(midname);

		
		Scanner scann = new Scanner(System.in);
		System.out.printf("\nEnter your lastname : ");
		String lastname=scann.next();
		nm.name(lastname);
		
			sc.close();
			scan.close();
			scann.close();
			System.out.println();
			System.out.println();

				System.out.println("\n====================================");
				System.out.printf("\tF U L L   N A M E : ");
				System.out.println("\n====================================");

			
			if (midname =="") {
				System.out.printf("\t"+firstname+" "+lastname).println();

			};
			
			
			if(midname !="") {
				System.out.printf("\t"+firstname+" "+midname+" "+lastname).println();

			};

	}

}
