package collections;

import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		
		java.util.ListIterator<String> itr = list.listIterator();
		System.out.println("Traversing the list in the Forward directionn :");

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Traversing the list in the Backward directionn :");

		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
