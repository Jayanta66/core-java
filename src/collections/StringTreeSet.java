package collections;

import java.util.Set;
import java.util.TreeSet;

import collections.comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());
		set.add("abcpppppppp");
		set.add("xyzlll");
		set.add("xyz");

		for (String obj : set) {
			System.out.println(obj);
		}
	}

}
