package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class FiftyProblem {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(54);
		ls.add(20);
		ls.add(70);
		
		ls.forEach(num ->{
			if(num > 50) {
				System.out.println(num);
			}
		});

	}

}
