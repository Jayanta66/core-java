package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		
		l.add("V");
		l.add("B");
		l.add("J");
		l.add("K");
		l.add("E");
		
		System.out.println("Before Sorting : "+l);
		
		Collections.sort(l);
		System.out.println("After Sorting : "+l);

		Collections.sort(l, new MyComparator());
		
		System.out.println("After Sorting : "+l);


		int result = Collections.binarySearch(l, "K");
		System.out.println("Index is : "+result);
		
	}

}
