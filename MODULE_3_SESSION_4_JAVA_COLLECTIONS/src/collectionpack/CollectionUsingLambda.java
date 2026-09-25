package collectionpack;

import java.util.Arrays;
import java.util.List;

public class CollectionUsingLambda {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30); //return of asList is ArrayList instance
		list.forEach(num->System.out.println(num));
	}

}
