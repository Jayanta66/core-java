package stringg;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "One";
		String s2 = new String("Two");
		char c[]= {'a','b','c','d','e'};
		String s3 = new String(c);
		byte b[] = {65,66,67};
		String s4 = new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
