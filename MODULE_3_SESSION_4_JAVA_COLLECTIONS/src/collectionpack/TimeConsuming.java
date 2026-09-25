package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class TimeConsuming {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(40);
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(30);
		ls.add(40);
		
		list.addAll(2,ls);
		System.out.println(list);
	}

}
