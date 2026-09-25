package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s = new String("heyy i am java dev ;:.,");
		StringTokenizer st = new StringTokenizer(s," ,;:./");
		
		List<String> ls = new ArrayList<String>();
		
		while(st.hasMoreTokens() ) {
			String temp = st.nextToken().toLowerCase();
			if(!ls.contains(temp)) {
				ls.add(temp);
			}
		}
		
		Collections.sort(ls);
		System.out.println(ls);
		System.out.println(ls.lastIndexOf('d'));
		System.out.println(ls.subList(1, 3));

	}

}
