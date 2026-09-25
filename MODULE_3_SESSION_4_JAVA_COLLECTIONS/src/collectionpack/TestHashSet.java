package collectionpack;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Jsp");
		set.add("Jsp");
		set.add("Spring boot");
		
		System.out.println(set);
		
		Enumeration<String> e = Collections.enumeration(set);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
