package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rating {

	public static void main(String[] args) {
		List<Double> rate = new ArrayList<Double>();
		rate.add(3.4);
		rate.add(7.0);
		Collections.sort(rate,Collections.reverseOrder());
		System.out.println(rate);
	}

}
