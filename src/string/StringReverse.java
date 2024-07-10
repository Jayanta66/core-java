package string;

public class StringReverse {

	public static void main(String[] args) {
		
		String nam = "Welcome";
		String reverseNam = "";
		for(int i= nam.length()-1; i>=0; i--) {
			reverseNam= reverseNam + nam.charAt(i);
		}
		System.out.println("   M A I N   S T R I N G");
		System.out.println("=============================");

		System.out.println("String is : "+nam);
		System.out.println("=============================");

		System.out.println();
		System.out.println();

		
		System.out.println("   R E V E R S E   S T R I N G");
		System.out.println("==================================");
		System.out.println("Reverse String is : "+reverseNam);
		System.out.println("==================================");

	}

}
