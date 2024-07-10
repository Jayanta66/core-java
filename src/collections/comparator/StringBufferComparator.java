package collections.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringBufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {

		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2);

	}

}
