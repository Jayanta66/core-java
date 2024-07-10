package collection.autobosxingUnboxing;

import java.util.ArrayList;

public class AutobosxingUnboxingRunner {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(25);
		
		System.out.println("Autoboxing :"+numbers);

		System.out.println("Unboxing :"+numbers.get(0));
		
		
	}

}
