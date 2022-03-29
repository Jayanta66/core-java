package collections;

import java.util.Set;
import java.util.TreeSet;

import collections.comparator.StringBufferComparator;

public class StringTreeSet2 {

	public static void main(String[] args) {

		Set<StringBuffer> set = new TreeSet<>(new StringBufferComparator());
		set.add(new StringBuffer("abcpppppppp"));
		set.add(new StringBuffer("xyzkkkk"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("jkl"));
		
		for(StringBuffer obj : set) {
			System.out.println(obj);
		}
	}

}
