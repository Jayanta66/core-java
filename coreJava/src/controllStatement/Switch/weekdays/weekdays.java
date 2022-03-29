package controllStatement.Switch.weekdays;

import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) {

		
		int number1,number2,choice,ex;

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("W E E K D A Y S");
		System.out.println("================");
		System.out.println();
		System.out.printf(" 1 ");
		System.out.printf("2 ");
		System.out.printf("3 ");
		System.out.printf("4 ");
		System.out.printf("5 ");
		System.out.printf("6 ");
		System.out.println("7 ");
		System.out.println();


		System.out.println("================");
		System.out.println("Enter Your Choice to Display the day: ");

		choice = scanner.nextInt();
		System.out.println("Number You have Entered : "+choice);

		switch(choice) {
	
		case 1:
			System.out.println("MONDAY ");
		break;
			
		case 2:
			System.out.println("TUESDAY ");
		break;
			
			
		case 3:
			System.out.println("WEDNESDAY ");
		break;
			
		case 4:
			System.out.println("THURSDAY ");
		break;	
		
		
		
		case 5:
		System.out.println("FRIDAY ");
		break;	
		
	
	
		case 6:
			System.out.println("SATURDAY ");
		break;	


		case 7:
			System.out.println("SUNDAY ");
		break;	
		}
		
		System.out.println("\"Good bye\",Please Re-Run same code To display again.");

	}

}
