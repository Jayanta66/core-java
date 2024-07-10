package someBasic;

public class SomeBasic_a {

	public static void main(String[] args) {

		 System.out.println("Exercise 3 : Print \"Hello World\" .");

		System.out.println("Hello World ");
		System.out.println("====================================");

		System.out.println();
		 System.out.println("Exercise 4 : Print 5*3 as is");

		System.out.println("5*3 ");
		System.out.println("====================================");
		
		
		System.out.println();
		 System.out.println("Exercise 5 : Print calculated value of 5*3");

		 int a,b;
		 
		 a=5;
		 b=3;
		 
		System.out.println(" Calculated value of 5*3 = "+ (a*b));
		System.out.println("====================================");
		
	
		 System.out.println("Exercise 6 : How to print mathematical table of 5 now?");
	
		 
		 a=5;
		 b=1;
		 
		System.out.println("Value of 5*1 = "+ (a*b));
		
		
		 a=5;
		 b=2;
		 
		System.out.println("Value of 5*2 = "+ (a*b));

		
		
		 a=5;
		 b=3;
		 
		System.out.println("Value of 5*3 = "+ (a*b));

		
		
		 a=5;
		 b=4;
		 
		System.out.println("Value of 5*4 = "+ (a*b));

		
		
		 a=5;
		 b=5;
		 
		System.out.println("Value of 5*5 = "+ (a*b));

		
		
		 a=5;
		 b=6;
		 
		System.out.println("Value of 5*6 = "+ (a*b));

		
		

		
		
		 a=5;
		 b=7;
		 
		System.out.println("Value of 5*7 = "+ (a*b));

		
		
		 a=5;
		 b=8;
		 
		System.out.println("Value of 5*8 = "+ (a*b));

		 a=5;
		 b=9;
		 
		System.out.println("Value of 5*9 = "+ (a*b));
	
		 a=5;
		 b=10;
		 
		System.out.println("Value of 5*10 = "+ (a*b));
		
		
		System.out.println("====================================");
		System.out.println();

		System.out.println("Exercise 7 : Print number of seconds in a day using System.out.println");

		int c;
		a=24;
		b=60;
		c = 60; 
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);

		System.out.println("Value of c = "+c);

		System.out.println("Number of seconds in a day using System.out.println :  "+(a*b*c));
		System.out.println("==============================================================");
	
		
		System.out.println();
		
		System.out.println("Hello \"world");
		System.out.println("Hello \nworld");
		System.out.println("Hello \tworld");
		System.out.println("Hello \\world");
		System.out.println("Hello \\\\world");
		System.out.println(Math.random());
		
		a=10;
		b=60;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);

		System.out.println("Max value = "+Math.max(a,b));
		System.out.println("Min value = "+Math.min(a,b));
		
		System.out.printf("%d * %d = %d", 5,7,5*7).println();
		System.out.println();

		System.out.println("==============================================");
		System.out.println("Exercise 7 :");

		System.out.printf("%d + %d + %d = %d", 5,6,7,5+6+7).println();

		System.out.printf("%f + %f + %f = %f", 5.5,6.5,7.2,5.5+6.5+7.2).println();

		
		int i;
		i=1;
		System.out.println("Valu of i = "+ i);

		System.out.printf("%d + %d + %d = %d", 5,i,7,5+i+7).println();

		System.out.println();

		System.out.println("==============================================");
	
		System.out.println("Exercise 8 :Create three integer variable aa,bb&cc.\n"
				+ "Create a statement for printing sum of three variable.\\n"
				+ "Modify valu of aa.\n"
				+ "Print value of aa+bb+cc.\n"
				+ "Modify value of bb.\n"
				+ "Print value of aa+bb+cc. ");
		System.out.println();

		
		int aa,bb,cc;
		
		aa=10;
		bb=20;
		cc=30;
		System.out.println("Value of aa = "+aa);
		System.out.println("Value of bb = "+bb);
		System.out.println("Value of cc = "+cc);

		System.out.println("Sum of three variable aa+bb+cc = "+(aa+bb+cc));

		aa=5;
		bb=20;
		cc=30;
		System.out.println("Value of aa(after Modify the value) = "+aa);
		System.out.println("Value of bb = "+bb);
		System.out.println("Value of cc = "+cc);

		System.out.println("Sum of three variable aa+bb+cc = "+(aa+bb+cc));

		aa=10;
		bb=50;
		cc=30;
		System.out.println("Value of aa = "+aa);
		System.out.println("Value of bb(after Modify the value) = "+bb);
		System.out.println("Value of cc = "+cc);

		System.out.println("Sum of three variable aa+bb+cc = "+(aa+bb+cc));

		

		System.out.println();

		System.out.println("===============================================================================");

		System.out.println("Exercise 9 : Have four variable a1,b1,c1,d1 and create an if statement to print if a+b is greater than c+d.\n"
				+"Have three angles of a triange stored in three variable angle1,angle2,angle3.\n"
				+ "create an if statement to state if the three angles can form a triangle .\n"
				+ "Hint: angle1+angle2+angle3 =180\n"
				+ "Have a variable called number.\n"
				+ "Create an if statement to find if it is even number.\n"
				+ "Hint : %operator. ");
		
		
		int a1,b1,c1,d1;
		a1=10;
		b1=2;
		c1=3;
		d1=4;
		System.out.println("a = "+a1);

		System.out.println("b = "+b1);
		System.out.println("c = "+c1);
		System.out.println("d = "+ d1);

		if(a1+b1>c1+d1) {
		System.out.println("a+b is greater than c+d.");
		}
		System.out.println("=================================================================");
	
		int angle1,angle2,angle3;
		angle1=100;
		angle2=20;
		angle3=60;
		if(angle1+angle2+angle3 == 180) {
		System.out.println("Valid Triangle.");
		}
		System.out.println();
	
		int number = 4;
		if(number%2==0) {
			System.out.println("number is even .");

		}
		System.out.println();

		System.out.println("===============================================================================");
		System.out.println();


		
	}

}
