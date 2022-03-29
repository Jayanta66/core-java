package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		set.add("abc");
		set.add("xyz");
		
		for (String obj : set) {
			System.out.println(obj);
		}
	}

}
